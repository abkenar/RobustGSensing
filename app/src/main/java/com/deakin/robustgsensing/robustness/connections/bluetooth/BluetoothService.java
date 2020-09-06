package com.deakin.robustgsensing.robustness.connections.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Handler;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

public class BluetoothService {

	private final BluetoothAdapter mAdapter;
	private final Handler mHandler;
    private AcceptThread mAcceptThread;
    private ConnectThread mConnectThread;
    private ConnectedThread mConnectedThread;
	private int mState;
	private int deviceMode;
	private String deviceName;

    // Constants that indicate the current connection state
    public static final int STATE_NONE = 0;       // we're doing nothing
    public static final int STATE_LISTEN = 1;     // now listening for incoming connections
    public static final int STATE_CONNECTING = 2; // now initiating an outgoing connection
    public static final int STATE_CONNECTED = 3;  // now connected to a remote device
    
    public final int CLIENT_MODE = 0;  // 
    public final int SERVER_MODE = 1;  // 
	
	// Constructor
	public BluetoothService(Context context, Handler handler) {
		mAdapter = BluetoothAdapter.getDefaultAdapter();
		mHandler = handler;
	}
	
	
	private synchronized void setState(int state) {
        mState = state;
        // Give the new state to the Handler so the UI Activity can update
        mHandler.obtainMessage(CommonConstants.MESSAGE_STATE_CHANGE, state, -1).sendToTarget();
    }
	
	  public synchronized int getState() {
	        return mState;
	    }
	  
	  public synchronized void setMode(int mode)
	  {
		  deviceMode=mode;
	  }
	  
	  public synchronized int getMode()
	  {
		  return deviceMode;
	  }
	  
	  private void manageConnectedSocket(BluetoothSocket pSoc) {
		  mConnectedThread = new ConnectedThread(pSoc, mHandler);
		  mConnectedThread.start();
		}
	  
	  public synchronized void start() {

	        // Start the thread to listen on a BluetoothServerSocket
	        if (mAcceptThread == null) {
	            mAcceptThread = new AcceptThread();
	            mAcceptThread.start();
	        }
	        setState(STATE_LISTEN);
	    }
	  
	  /**
	     * Stop all threads
	     */
	  
	    public synchronized void stop() {
	        if (mConnectThread != null) {mConnectThread.cancel(); mConnectThread = null;}
	        if (mConnectedThread != null) {mConnectedThread.cancel(); mConnectedThread = null;}
	        if (mAcceptThread != null) {mAcceptThread.cancel(); mAcceptThread = null;}
	        setState(STATE_NONE);
	    }
	    

	  
	  
	  public synchronized void connect(BluetoothDevice device) {

	        mConnectThread = new ConnectThread(device);
	        mConnectThread.start();
	        setState(STATE_CONNECTING);
		  	this.deviceName = device.getName();
	    }
	  
	    public void write(byte[] out) {
	        // Create temporary object
	        ConnectedThread r;
	        // Synchronize a copy of the ConnectedThread
	        synchronized (this) {
	            //if (mState != STATE_CONNECTED) return;
	            r = mConnectedThread;
	        }
	        // Perform the write unsynchronized
	        r.write(out);
	    }
	  
		private class AcceptThread extends Thread {
			private final BluetoothServerSocket serverSocket;
			private UUID uuid = UUID.fromString(CommonConstants.MY_UUID);
			private final String name = CommonConstants.BTSERVIC_ENAME;

			public AcceptThread() {
				// Use a temporary object that is later assigned to mmServerSocket,
				// because mmServerSocket is final
				BluetoothServerSocket tmp = null;
				try {
					// uuid is the app's UUID string, also used by the client
					// code
					tmp = mAdapter.listenUsingRfcommWithServiceRecord(name, uuid);
				} catch (IOException e) {
				}
				serverSocket = tmp;
			}

			public void run() {
				BluetoothSocket socket = null;
				// Keep listening until exception occurs or a socket is returned
				while (true) {
					try {
						//System.out.println("accepting...");
						Log.d("SERVER", "Accepting ....");
					
						socket = serverSocket.accept();
					//	uuid = UUID.fromString(CommonConstants.UUID_STRING2);
						Log.d("SERVER", "Accepted ....");
					} catch (IOException e) {
						break;
					}
					// If a connection was accepted
					if (socket != null) {
						// Do work to manage the connection (in a separate thread)
						manageConnectedSocket(socket);
						/*try {
							serverSocket.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
						*/
					}
			
				}
			}

			/** Will cancel the listening socket, and cause the thread to finish */
			
			public void cancel() {
				try {
					serverSocket.close();
				} catch (IOException e) {
				}
			}
			
		}
		
		
		public class ConnectedThread extends Thread {
			private BluetoothSocket mmSocket;
		    private InputStream mmInStream;
		    private OutputStream mmOutStream;
		    private Handler handler;
		    private StringBuilder incoming = new StringBuilder();
		 
		    public ConnectedThread(BluetoothSocket socket, Handler pHandler) {
		        mmSocket = socket;
		        InputStream tmpIn = null;
		        OutputStream tmpOut = null;
		        handler = pHandler;
		 
		        setState(STATE_CONNECTED);

				//mHandler.obtainMessage(CommonConstants.MESSAGE_DEVICE_NAME, deviceName, -1).sendToTarget();
		        
		        // Get the input and output streams, using temp objects because
		        // member streams are final
		        try {
		            tmpIn = socket.getInputStream();
		            tmpOut = socket.getOutputStream();
		        } catch (IOException e) { }
		 
		        mmInStream = tmpIn;
		        mmOutStream = tmpOut;
		    }
		 
		    public void run() {

		    	byte[] buffer = new byte[1024];  // buffer store for the stream
		        int bytes; // bytes returned from read()
		 
		     // Keep listening to the InputStream until an exception occurs
		        while (true) {
		            try {
		                // Read from the InputStream
		                bytes = mmInStream.read(buffer);
		                // Send the obtained bytes to the UI activity
		                mHandler.obtainMessage(CommonConstants.MESSAGE_READ, bytes, -1, buffer)
		                        .sendToTarget();
		            } catch (IOException e) {
		                break;
		            }
		        }
		    }
		 
		    /* Call this from the main activity to send data to the remote device */
		    public void write(byte[] bytes) {
		        try {
		            mmOutStream.write(bytes);
		        } catch (IOException e) { }
		    }
		 
		    /* Call this from the main activity to shutdown the connection */
		    
		    
		    public void cancel() {
		        try {
		        	mmSocket.close();
		        } catch (IOException e) { }
		    }
		    
		}
		
		
		
		private class ConnectThread extends Thread {
		    private final BluetoothSocket mmSocket;
		    private final UUID uuid = UUID.fromString(CommonConstants.MY_UUID);
		    public ConnectThread(BluetoothDevice device) {
		        // Use a temporary object that is later assigned to mmSocket,
		        // because mmSocket is final
		        BluetoothSocket tmp = null;
		 
		        // Get a BluetoothSocket to connect with the given BluetoothDevice
		        try {
		            // MY_UUID is the app's UUID string, also used by the server code
		            //original one:
					//tmp = device.createRfcommSocketToServiceRecord(uuid);

					//tmp = device.createInsecureRfcommSocketToServiceRecord(uuid);

					tmp = device.createRfcommSocketToServiceRecord(uuid);

					//tmp = InsecureBluetooth.listenUsingRfcommWithServiceRecord(mAdapter, NAME, MY_UUID, true);

		        } catch (IOException e) { }
		        mmSocket = tmp;
		    }
		 
		    public void run() {
		        // Cancel discovery because it will slow down the connection
		    	mAdapter.cancelDiscovery();
		 
		        try {
		            // Connect the device through the socket. This will block
		            // until it succeeds or throws an exception
		            mmSocket.connect();
		            
		            Log.i("Client", "CONNECTED SUCCESSFULLY ....");
		            
		        } catch (IOException connectException) {
		        	connectException.printStackTrace();
		        	Log.e("CLient", "UNABLE to CONNECTED SUCCESSFULLY ....");
		            // Unable to connect; close the socket and get out
		            
		        	/*
		        	try {
		                mmSocket.close();
		            } catch (IOException closeException) { 
		            	closeException.printStackTrace();
		            }
		            */
		            return;
		        }
		 
		        // Do work to manage the connection (in a separate thread)
		        manageConnectedSocket(mmSocket);
		    }
		 
		    /** Will cancel an in-progress connection, and close the socket */
		    
		    public void cancel() {
		        try {
		            mmSocket.close();
		        } catch (IOException e) { }
		    }
		    
		}
		
		

}
