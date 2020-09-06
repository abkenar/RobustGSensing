package com.deakin.robustgsensing.groupsense;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.BatteryManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.speech.tts.TextToSpeech;
import android.text.Spanned;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.mpc.latrobe.eecsar.bluetooth.BluetoothService;
import com.mpc.latrobe.eecsar.bluetooth.CommonConstants;
import com.mpc.latrobe.eecsar.constants.Constants;
import com.mpc.latrobe.eecsar.log.*;
import com.mpc.latrobe.eecsar.models.*;
import com.mpc.latrobe.eecsar.sensormanager.*;
import com.mpc.latrobe.eecsar.sim.ActivityGenerator;
import com.mpc.latrobe.eecsar.utils.*;
import com.mpc.latrobe.eecsar.utils.DeviceUtils;
import com.mpc.latrobe.eecsar.utils.MessageParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


@SuppressLint("HandlerLeak")
public class GAR extends Activity // implements
// TextToSpeech.OnInitListener, LocationListener
{


    private TextToSpeech tts;
    List<MobileDevice> mobileDevices;
    HashMap<String, MobileDevice> mobielDevicesHashMap = new HashMap<String, MobileDevice>();

    private doPreiodicDiscoveryThread discoveryThread;
    private getPreiodicBatteryLevelThread batteryLevelThread;

    private static final int REQUEST_CONNECT_DEVICE = 1;
    private static final int REQUEST_ENABLE_BT = 2;

    // Name of the connected device
    private String mConnectedDeviceName = null;
    // Array adapter for the conversation thread
    private ArrayAdapter<String> mConversationArrayAdapter;
    // String buffer for outgoing messages
    private StringBuffer mOutStringBuffer;
    // Local Bluetooth adapter
    private BluetoothAdapter mBluetoothAdapter = null;

    // Member object for the chat services
    // private BluetoothChatService mChatService = null;

    // Member object for the BT services - NEW
    private BluetoothService mBTService = null;

    Set<BluetoothDevice> pairedDevices;

    HashMap<String, String> myNeighborsActivity = new HashMap<String, String>();

    private SendMessageThread smth;
    DoDiscoveryTillFoundServerThread doDiscoveryTillFoundServerThread;

    private LocationManager mlocManager;
    private String provider;

    Button connectBtn;
    Button startUpdateButton;

    boolean groupActivityDetected = false;
    private String previousActivity = "";
    private float previousDirection = 0;
    private String participants;
    private CompassSensorListener csl;
    // *****************************************************************

    private static final int MAX_LOG_SIZE = 5000;

    // Instantiates a log file utility object, used to log status updates


    // Holds the ListView object in the UI
    private ListView mStatusListView;

    /*
     * Holds activity recognition data, in the form of strings that can contain
     * markup
     */
    private ArrayAdapter<Spanned> mStatusAdapter;

    /*
     * Intent filter for incoming broadcasts from the IntentService.
     */
    IntentFilter mBroadcastFilter;

    public static int bLabel = 0;
    Handler serviceHandler = new Handler();
    PowerManager manager = null;

    String url = null;
    String listenURL = null;
    EditText et = null;

    TextView collActivity = null;

    TextView atomicActivity;

    String mode = null;

    private int BTDiscoveryTimeInterval;
    private int batteryLevelReadingTimeInterval;

    private GroupActivity groupActivity;

    // private List<PersonActivity> allReceivedMessages;
    private List<Individual> allReceivedMessages;

    String myDeviceName;
    String encodedMsg;

    SensorManager sensorMgr;
    ImageView p1;
    ImageView p2;
    ImageView p3;

    ImageView p1Activity;
    ImageView p2Activity;
    ImageView p3Activity;

    TextView p1Name;
    TextView p2Name;
    TextView p3Name;

    boolean p1Detected = false;
    boolean p2Detected = false;
    boolean p3Detected = false;

    TextView detectedGA;

    List<String> detectedDevices;

    private ImageView imageview;
    GifView gifView2;

    /*
     * Set main UI layout, get a handle to the ListView for logs, and create the
     * broadcast receiver.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gar);

        Log.d("amin", "on");

        Init init = new Init();

        detectedDevices = new ArrayList<String>();

        p1 = (ImageView) findViewById(R.id.p1);
        p2 = (ImageView) findViewById(R.id.p2);
        p3 = (ImageView) findViewById(R.id.p3);

        p1.setVisibility(View.INVISIBLE);
        p2.setVisibility(View.INVISIBLE);
        p3.setVisibility(View.INVISIBLE);

        p1Activity = (ImageView) findViewById(R.id.p1Activity);
        p2Activity = (ImageView) findViewById(R.id.p2Activity);
        p3Activity = (ImageView) findViewById(R.id.p3Activity);

        p1Activity.setVisibility(View.INVISIBLE);
        p2Activity.setVisibility(View.INVISIBLE);
        p3Activity.setVisibility(View.INVISIBLE);

        p1Name = (TextView) findViewById(R.id.p1Name);
        p2Name = (TextView) findViewById(R.id.p2Name);
        p3Name = (TextView) findViewById(R.id.p3Name);

        p1Name.setVisibility(View.INVISIBLE);
        p2Name.setVisibility(View.INVISIBLE);
        p3Name.setVisibility(View.INVISIBLE);

        detectedGA = (TextView) findViewById(R.id.gaText);

//		gifView2 = (GifView) findViewById(R.id.gif_view);
//		gifView2.setImgae(getApplicationContext().getResources().openRawResource(+R.drawable.ani_bart));
//		gifView2.setImgae(getApplicationContext().getResources().openRawResource(+R.drawable.walking));


        checkSimMode();
        Globals.getInstance().setServerName("amin's temi 1");

        // Set the main layout

        sensorMgr = (SensorManager) getApplicationContext().getSystemService(
                Context.SENSOR_SERVICE);

        BTDiscoveryTimeInterval = 20000; // 20 sec
        batteryLevelReadingTimeInterval = 60000; // 60sec = 1 min


        connectBtn = (Button) findViewById(R.id.connect);
        connectBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                initConnections();
            }
        });

        startUpdateButton = (Button) findViewById(R.id.start_update_button);
        startUpdateButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                getAccelerometer();
                getDirection();

            }
        });

//		ScrollView scroller = new ScrollView(this);
        collActivity = (TextView) findViewById(R.id.collActivityText);
//		scroller.addView(collActivity);

        // *************************

        // Get local Bluetooth adapter
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        // If the adapter is null, then Bluetooth is not supported
        if (mBluetoothAdapter == null) {
            Toast.makeText(this, "Bluetooth is not available",
                    Toast.LENGTH_LONG).show();
            finish();
            return;
        }

        if (mBTService == null) {
            // Initialize the BluetoothChatService to perform bluetooth
            // connections
            mBTService = new BluetoothService(this, mHandler);

            // Initialize the buffer for outgoing messages
            mOutStringBuffer = new StringBuffer("");
        }

        // Get device name and set devicename in Globals variable
        DeviceUtils.getDeviceName(getApplicationContext());


        // These run once
        initBluetooth();

        //doDiscovery();

        if (mBTService.getMode() == mBTService.CLIENT_MODE) {
            doDiscoveryTillFoundServerThread = new DoDiscoveryTillFoundServerThread();
            doDiscoveryTillFoundServerThread.start();
        }


//		List<Node> connectedNodes =
//				Wearable.NodeApi.getConnectedNodes(mGoogleApiClient).await().getNodes();

        //getBatteryLevel();

        // getDirection();

        // UNCOMMENT LATER
        // discoveryThread = new doPreiodicDiscoveryThread();
        // discoveryThread.start();

        batteryLevelThread = new getPreiodicBatteryLevelThread();
        batteryLevelThread.start();

        //showDialog();

        //showProgress();





    } // end onCreate()





    // used to determine when was the last transmit
    public long lastTransmission = 0;

    // The Handler that gets information back from the BluetoothService
    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case CommonConstants.MESSAGE_STATE_CHANGE:
                    switch (msg.arg1) {
                        case BluetoothService.STATE_CONNECTED:
                            // mTitle.setText(R.string.title_connected_to);
                            // mTitle.append(mConnectedDeviceName);
                            // mConversationArrayAdapter.clear();

                            if (mBTService.getMode() == mBTService.CLIENT_MODE) {
                                smth = new SendMessageThread();
                                smth.start();
                                Toast.makeText(getApplicationContext(),
                                        "Sending Messages Thread Started",
                                        Toast.LENGTH_SHORT).show();

                            }

                            showIconWhenConnected();

                            Toast.makeText(getApplicationContext(),
                                    "You are connected to " + mConnectedDeviceName,
                                    Toast.LENGTH_SHORT).show();

                            break;
                        case BluetoothService.STATE_CONNECTING:
                            // mTitle.setText(R.string.title_connecting);
                            break;
                        case BluetoothService.STATE_LISTEN:
                        case BluetoothService.STATE_NONE:
                            // mTitle.setText(R.string.title_not_connected);
                            break;
                    }
                    break;

                // When Master Reads the device
                case CommonConstants.MESSAGE_READ:

                    byte[] readBuf = (byte[]) msg.obj;
                    // construct a string from the valid bytes in the buffer
                    String readMessage = new String(readBuf, 0, msg.arg1);


                    Log.i("BT", "Message Received ..." + readMessage);

                    Long msgReceivedTimeStamp = System.currentTimeMillis();

                    Mylogger.writeDataForDetectedGroupActivities(readMessage,
                            "all_atomic_activities.csv");

                    if (allReceivedMessages == null)
                        // allReceivedMessages = new ArrayList<PersonActivity>();
                        allReceivedMessages = new ArrayList<Individual>();

                    List<String> decoded = new ArrayList<String>();

                    decoded = MessageParser.decodeMessage(readMessage);
                    Individual individualObj = new Individual(decoded.get(0),
                            decoded.get(1), Float.valueOf(decoded.get(2)),
                            decoded.get(3));

                    Log.d("direction of " + individualObj.getDeviceName(),
                            String.valueOf(individualObj.getDirection()));

                    updateDeviceName(decoded.get(0));
                    updateMasterUI(decoded.get(0), decoded.get(1));

                    allReceivedMessages.add(individualObj);

                    // Adding receiver (Master Device) activity
                    individualObj = new Individual(Globals.getInstance()
                            .getDeviceName(), Globals.getInstance()
                            .getMyAtomicActivity(), Globals.getInstance()
                            .getDeviceDirection(), DateTime.getCurrentTime());
                    allReceivedMessages.add(individualObj);

                    Log.d("check size", "at: " + DateTime.getCurrentDateTime() + "  all received size: " + allReceivedMessages.size());

                    Log.d("direction of master", String.valueOf(Globals
                            .getInstance().getDeviceDirection()));

                    // Run Query to infer GA
                    if (msgReceivedTimeStamp - lastTransmission > 8000) {

                        Log.d("Run Query", "at: " + DateTime.getCurrentDateTime() + "  all received size: " + allReceivedMessages.size());
                        lastTransmission = msgReceivedTimeStamp;

					/*
                     * String temp =
					 * allReceivedMessages.get(0).getActivityName(); for
					 * (PersonActivity iterator : allReceivedMessages) { if
					 * (iterator.getActivityName().equalsIgnoreCase(temp)) {
					 * groupActivityDetected = true; temp =
					 * iterator.getActivityName(); } else {
					 * groupActivityDetected = false; break; } }
					 * 
					 * if (groupActivityDetected = true) { String
					 * allPersonDoingSameActivity = ""; String
					 * currentDetectedGroupActivity = allReceivedMessages
					 * .get(0).getActivityName(); for (PersonActivity iterator :
					 * allReceivedMessages) { allPersonDoingSameActivity =
					 * allPersonDoingSameActivity + iterator.getPersonName() +
					 * " AND"; }
					 * 
					 * String output = allPersonDoingSameActivity +
					 * " are doing " + currentDetectedGroupActivity + " at: " +
					 * DataTime.getCurrentDataTime(); // Write Detected group
					 * Activity into file
					 * Mylogger.writeDataForDetectedGroupActivities(output,
					 * "detected_group_activities.csv");
					 * allReceivedMessages.clear(); }
					 */

                        participants = "";
                        previousActivity = "";
                        previousDirection = 0;

                        List<String> participantList = new ArrayList<String>();

                        int count = 1;
                        for (Individual obj : allReceivedMessages) {

                            // for first element in collection (all received
                            // messages) - goes to this if definitley for the first
                            // time
                            if (previousActivity.equalsIgnoreCase("")) {
                                Log.d("Reasoner",
                                        "AminLog - Previous activity is empty");
                                previousActivity = obj.getAtomicActivity();
                                previousDirection = obj.getDirection();
                            }

                            // Log.d("direction differenc",String.valueOf(Math.abs(obj.getDirection()
                            // - previousDirection)));

                            // if previous activity is same and directions is
                            // roughly same

                            Log.d("", "pevious :" + previousDirection + " current:"
                                    + obj.getDirection());

//                            if (obj.getAtomicActivity().equals(previousActivity)
//                                    && (Math.abs(obj.getDirection()
//                                    - previousDirection) < 40)) {

                            // first time
                            if (participants.equalsIgnoreCase("")) {
                                Log.d("Reasoner",
                                        "AminLog - first item of the window");
                                participants = obj.getDeviceName();
                                participantList.add(participants);

                            } else if (!participantList.contains(obj
                                    .getDeviceName())) {
                                participants += " AND " + obj.getDeviceName();
                                Log.d("Reasoner", "Participants - "
                                        + participants);
                                // Store participants for further checking
                                participantList.add(obj.getDeviceName());
                            }

//                            } else {
//                                // do nothing
//                            }

                            previousActivity = obj.getAtomicActivity();
                            previousDirection = obj.getDirection();

                            count++;
                        }

                        // if GA detected sore in data Store
                        if (!participants.equalsIgnoreCase("")
                                && participantList.size() > 1) {

                            GroupActivity ga = new GroupActivity();

                            Log.d("",
                                    "AminLog - Group Activity Detected : "
                                            + participants
                                            + " "
                                            + GroupActivityUtils
                                            .getGroupActivityName(previousActivity));

                            ga.setStartTime(DateTime.getCurrentTime());

                            ga.setGroupActivity(GroupActivityUtils
                                    .getGroupActivityName(previousActivity));
                            ga.setParticipants(participants);

                            detectedGA.setText(ga.getParticipant() + " are " + ga.getGroupActivity());

                            // Add to Log file
                            Mylogger.writeDataForDetectedGroupActivities(
                                    ga.getParticipant() + " are "
                                            + ga.getGroupActivity() + " at "
                                            + ga.getStartTime(),
                                    "detected_group_activities.csv");

                        }

                        allReceivedMessages.clear();

                    } // end query


                    myNeighborsActivity.put(mConnectedDeviceName, readMessage);

                    // (readMessage.equals(Globals.getInstance().getMyAtomicActivity()))

                    if (readMessage.equals(Globals.getInstance()
                            .getMyAtomicActivity())) {

                        Toast.makeText(
                                getApplicationContext(),
                                "You and " + mConnectedDeviceName + " are "
                                        + readMessage, Toast.LENGTH_SHORT).show();

                        // speakOut("You and " + mConnectedDeviceName + " are "
                        // + readMessage);

                    } else
                        Globals.getInstance().resetMyInfo();

                    //collActivity.setText(readMessage);
                    collActivity.append(readMessage + "\n");

                    // mConversationArrayAdapter.add(mConnectedDeviceName + ":  "
                    // + readMessage);
                    break;
                case CommonConstants.MESSAGE_DEVICE_NAME:
                    // save the connected device's name
                    mConnectedDeviceName = msg.getData().getString(
                            CommonConstants.DEVICE_NAME);
                    Toast.makeText(getApplicationContext(),
                            "Connected to " + mConnectedDeviceName,
                            Toast.LENGTH_SHORT).show();

                    break;
                case CommonConstants.MESSAGE_TOAST:
                    Toast.makeText(getApplicationContext(),
                            msg.getData().getString(CommonConstants.TOAST),
                            Toast.LENGTH_SHORT).show();
                    break;
            }
        } // end handle message
    };

    /*
     * Register the broadcast receiver and update the log of activity updates
     */
    @Override
    protected void onResume() {
        super.onResume();

        startUpdateButton.performClick();
        // Commented by amin
        // mlocManager.requestLocationUpdates(provider, 5000, 1, this);


        // Register the broadcast receiver

    }

    /*
     * Create the menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }

    // *************************** MENU
    // ***********************************************

    /*
     * Handle selections from the menu
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle item selection
        switch (item.getItemId()) {

            // Clear the log display and remove the log files
            case R.id.menu_item_clearlog:
                // Clear the list adapter
                mStatusAdapter.clear();

                // Update the ListView from the empty adapter
                mStatusAdapter.notifyDataSetChanged();


                // Continue by passing true to the menu handler
                return true;

            // Display the update log
            case R.id.menu_item_showlog:

                Toast.makeText(this, String.valueOf(mStatusListView.getCount()),
                        Toast.LENGTH_LONG).show();

                // Continue by passing true to the menu handler
                return true;

            case R.id.menu_item_connect:

                return true;

            case R.id.menu_item_disconnect:
                try {
                    mBTService.stop();
                    Toast.makeText(this, "THis device disconnected from server",
                            Toast.LENGTH_SHORT).show();
                } catch (Exception e) {

                    Toast.makeText(this, "There are something wrong",
                            Toast.LENGTH_SHORT).show();
                }
                return true;
            // For any other choice, pass it to the super()
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // *************************************************************************************

    /**
     * Verify that Google Play services is available before making a request.
     *
     * @return true if Google Play services is available, otherwise false
     */
    private boolean servicesConnected() {

        // Check that Google Play services is available
        int resultCode = GooglePlayServicesUtil
                .isGooglePlayServicesAvailable(this);

        // If Google Play services is available
        if (ConnectionResult.SUCCESS == resultCode) {

            // In debug mode, log the status

            // Continue
            return true;

            // Google Play services was not available for some reason
        } else {

            // Display an error dialog
            GooglePlayServicesUtil.getErrorDialog(resultCode, this, 0).show();
            return false;
        }
    }

    /**
     * Respond to "Start" button by requesting activity recognition updates.
     *
     * @param view The view that triggered this method.
     */
    public void onStartUpdates(View view) {

        Toast.makeText(this, Globals.getInstance().getMyAtomicActivity(),
                Toast.LENGTH_LONG).show();


        // Check for Google Play services
        if (!servicesConnected()) {

            return;
        }

		/*
         * Set the request type. If a connection error occurs, and Google Play
		 * services can handle it, then onActivityResult will use the request
		 * type to retry the request
		 */

    }

    /**
     * Respond to "Stop" button by canceling updates.
     *
     * @param view The view that triggered this method.
     */
    public void onStopUpdates(View view) {

    }

    private Sensor getSensor(int type, SensorManager sensorMgr) {

        Sensor desired = null;
        for (Sensor sensor : sensorMgr.getSensorList(Sensor.TYPE_ALL)) {
            if (sensor.getType() == type) {
                desired = sensor;
            }
        }
        return desired;
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    // Bluetooth methods

    private synchronized void initBluetooth() {

        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        myDeviceName = mBluetoothAdapter.getName();

        if (mBluetoothAdapter == null) {
            // Device does not support Bluetooth
        }

        if (!mBluetoothAdapter.isEnabled()) {
            // Bluetooth isn't enabled, prompt the user to turn it on.
            Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(intent, REQUEST_ENABLE_BT);
        }

        // if this device is Temi which is master(server) : Keeps others
        // activities and others mobile
        // devices information
        if (mBluetoothAdapter.getName().equals(Globals.getInstance().getServerName())) {

            mBTService.setMode(mBTService.SERVER_MODE);
            MobileDevice mobileDeviceObj = new MobileDevice(
                    mBluetoothAdapter.getName(), Globals.getInstance()
                    .getMyAtomicActivity());
            mobielDevicesHashMap.put(mBluetoothAdapter.getName(),
                    mobileDeviceObj);
            // Start Keeping listening
            mBTService.start();
        } else {
            mBTService.setMode(mBTService.CLIENT_MODE);

        }
    }

    // Create a BroadcastReceiver for ACTION_FOUND
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            // When discovery finds a device
            if (BluetoothDevice.ACTION_FOUND.equals(action)) {

                int rssi = intent.getShortExtra(BluetoothDevice.EXTRA_RSSI,
                        Short.MIN_VALUE);
                // Toast.makeText(getApplicationContext(),
                // "  RSSI: " + rssi + "dBm", Toast.LENGTH_SHORT).show();
                // Get the BluetoothDevice object from the Intent
                BluetoothDevice device = intent
                        .getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);

                // commnedted by amin
                // Log.i("BT FOUND", device.getName() + " RSSI:" + rssi);

            } else if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED
                    .equals(action)) {

                getPairedDevice();

                unregisterReceiver(mReceiver);
                Log.i("mReceiver", "Unregistered");

            }
        }

    };

    private void doDiscovery() {
        // ensureDiscoverable();

        // Register the BroadcastReceiver
        IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        registerReceiver(mReceiver, filter);

        // Register for broadcasts when discovery has finished
        filter = new IntentFilter(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
        this.registerReceiver(mReceiver, filter);

        // If we're already discovering, stop it
        if (mBluetoothAdapter.isDiscovering()) {
            mBluetoothAdapter.cancelDiscovery();
        }
        // Request discover from BluetoothAdapter
        Log.d("BT", "BT Discovery Started ...");
        mBluetoothAdapter.startDiscovery();
    }

    private void ensureDiscoverable() {

        if (mBluetoothAdapter.getScanMode() != BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE) {
            Intent discoverableIntent = new Intent(
                    BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            discoverableIntent.putExtra(
                    BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300);
            startActivity(discoverableIntent);
        }
    }

    private void initConnections() {
        List<String> devicesName = new ArrayList<String>();
        if (pairedDevices != null) {
            for (BluetoothDevice device : pairedDevices) {
                // GT-I9100T , GalaxyTab nexus
                devicesName.add(device.getName());

                // client connects to Amin-S2 which acts as server
                if (device.getName().contains(Globals.getInstance().getServerName())
                        && mBTService.getMode() == mBTService.CLIENT_MODE) {
                    Log.e("BT", "Starting to connect to the server ... ");
                    connectToServer();
                    Log.e("BT", "Connected to the server");
                }
            }
        } else {
            Toast.makeText(this, "Cannot find any paired device, Please try again",
                    Toast.LENGTH_LONG).show();
        }
    }

    private void connectToServer() {
        if (pairedDevices.size() > 0)
            for (BluetoothDevice device : pairedDevices) {

                if (device.getName().equals(Globals.getInstance().getServerName())) {
                    mBTService.connect(device);
                    return;
                }

            }
    }

    private class SendMessageThread extends Thread {

        @Override
        public void run() {
            super.run();

            String lastSentMessage = "";

            while (true) {

                if (Globals.getInstance().getIsReadyToSend()) {
                    if (Constants.USING_GPS) {

                        encodedMsg = MessageParser.encodeMessage(myDeviceName,
                                Globals.getInstance().getMyAtomicActivity(),
                                Globals.getInstance().getDeviceDirection(),
                                Globals.getInstance().getLatitude(), Globals
                                        .getInstance().getLongitude(), Globals
                                        .getInstance().getClassfierTimeStamp());
                    } else {
                        encodedMsg = MessageParser.encodeMessage(myDeviceName,
                                Globals.getInstance().getMyAtomicActivity(),
                                Globals.getInstance().getDeviceDirection(),
                                Globals.getInstance().getClassfierTimeStamp());
                    }

                    // To filter duplicate messages with same time stamp
                    if (!lastSentMessage.equalsIgnoreCase(encodedMsg)) {
                        sendMessageToReceiver(encodedMsg);
                        lastSentMessage = encodedMsg;
                    }

                }
            }
        }

        private void sendMessageToReceiver(String message) {
            // Check that we're actually connected before trying anything
            if (mBTService.getState() != mBTService.STATE_CONNECTED) {
                return;
            }

            // Check that there's actually something to send
            if (message.length() > 0) { // && !message.equalsIgnoreCase("")
                // Get the message bytes and tell the BluetoothChatService to
                // write

                Mylogger.writeDataForDetectedGroupActivities(message,
                        "client_sent.csv");

                byte[] send = message.getBytes();
                mBTService.write(send);
                // Reset out string buffer to zero
                mOutStringBuffer.setLength(0);

            }
            // After sending the message terminate thread

            Globals.getInstance().setReadyToSend(false);
        }

    }

    private void writeData(String timestamp, int data) {
        try {
            File root = Environment.getExternalStorageDirectory();
            if (root.canWrite()) {
                File gpxfile = new File(root, "energy_consumption.csv");
                FileWriter gpxwriter = new FileWriter(gpxfile, true);
                gpxwriter.write(timestamp + "," + data);
                gpxwriter.write("\n");
                gpxwriter.flush();
                gpxwriter.close();
            }
        } catch (IOException e) {
            Log.e("BT", "Could not write file " + e.getMessage());
        }
    }

    private BroadcastReceiver batteryInfoReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            int health = intent.getIntExtra(BatteryManager.EXTRA_HEALTH, 0);
            int icon_small = intent.getIntExtra(
                    BatteryManager.EXTRA_ICON_SMALL, 0);
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            int plugged = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, 0);
            boolean present = intent.getExtras().getBoolean(
                    BatteryManager.EXTRA_PRESENT);
            int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, 0);
            int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, 0);
            String technology = intent.getExtras().getString(
                    BatteryManager.EXTRA_TECHNOLOGY);
            int temperature = intent.getIntExtra(
                    BatteryManager.EXTRA_TEMPERATURE, 0);
            int voltage = intent.getIntExtra(BatteryManager.EXTRA_VOLTAGE, 0);

            // Get a date formatter, and catch errors in the returned timestamp

            Calendar c = Calendar.getInstance();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = df.format(c.getTime());

            writeData(formattedDate, level);

            unregisterReceiver(batteryInfoReceiver);
            Log.i("BT", "batteryInfoReceiver Unregistered");

        }
    };

	/*
     * by amin
	 * 
	 * @Override public void onInit(int status) {
	 * 
	 * if (status == TextToSpeech.SUCCESS) {
	 * 
	 * int result = tts.setLanguage(Locale.US);
	 * 
	 * if (result == TextToSpeech.LANG_MISSING_DATA || result ==
	 * TextToSpeech.LANG_NOT_SUPPORTED) { Log.e("TTS",
	 * "This Language is not supported"); } else { // speakOut(""); }
	 * 
	 * } else { Log.e("TTS", "Initilization Failed!"); }
	 * 
	 * }
	 * 
	 * private void speakOut(String text) {
	 * 
	 * tts.speak(text, TextToSpeech.QUEUE_FLUSH, null); }
	 */

    @Override
    public void onDestroy() {

        super.onDestroy();
        // Stop the Bluetooth chat services
        if (mBTService != null)
            // mBTService .stop();
            if (tts != null) {
                tts.stop();
                tts.shutdown();
            }
    }

    private Set<BluetoothDevice> getPairedDevice() {

        pairedDevices = mBluetoothAdapter.getBondedDevices();
        // initiate group actvity with only mobile phone names
        if (pairedDevices.size() > 0) {
            groupActivity = new GroupActivity();
            List<String> tempMobileList = new ArrayList<String>();

            for (BluetoothDevice device : pairedDevices) {
                Log.d("BT", device.getName());
                Log.d("Accelerometer", "OFF");
                tempMobileList.add(device.getName());

                if (device.getName().equalsIgnoreCase(Globals.getInstance().getServerName())) {
                    Globals.getInstance().setServerFound(true);
                }
            }
            // groupActivity.setGroup(tempMobileList); uncomment
        }
        return pairedDevices;
    }

    // $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

    private class doPreiodicDiscoveryThread extends Thread {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
            while (true) {
                doDiscovery();
                try {
                    Thread.sleep(BTDiscoveryTimeInterval);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }

    }

    private class DoDiscoveryTillFoundServerThread extends Thread {
        ProgressDialog progress = new ProgressDialog(GAR.this);

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();

            try {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // Update UI views here...

                        progress.setTitle("Finding Master Device");
                        progress.setMessage("Wait while searching...");
                        progress.show();
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }

            while (!Globals.getInstance().isServerFound()) {
                doDiscovery();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            try {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // Update UI views here...
                        progress.hide();
                        showDialog();
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void setBTDiscoveryTimeInterval(int time) {
        BTDiscoveryTimeInterval = time;
    }

    public void getBatteryLevel() {
        // Register the BroadcastReceiver
        this.registerReceiver(this.batteryInfoReceiver, new IntentFilter(
                Intent.ACTION_BATTERY_CHANGED));
    }

    private class getPreiodicBatteryLevelThread extends Thread {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
            while (true) {
                getBatteryLevel();
                try {
                    Thread.sleep(batteryLevelReadingTimeInterval);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
    }

    public void getDirection() {
        try {
            Log.d("Compass", "ON");
            csl = new CompassSensorListener(getApplicationContext());
            csl.startCompassReading();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAccelerometer() {
        try {

            Log.d("Accelerometer", "ON");
            AccelerometerListener accListener = new AccelerometerListener(this,
                    (TextView) findViewById(R.id.info), (ImageView) findViewById(R.id.individualImage));
            accListener.startAccelerometerReading();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // starts activity generator thread if isSimeMode= true
    public void checkSimMode() {

        if (Globals.getInstance().isSimMode()) {

            ActivityGenerator ag = new ActivityGenerator();
            ag.generateAtomicActivityData("walking", 25);

        }

    }

    public void showDialog() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(GAR.this);

        // Setting Dialog Title
        alertDialog.setTitle("Confirm Connect...");

        // Setting Dialog Message
        alertDialog.setMessage("Are you sure you want connect to Master Device?");

        // Setting Icon to Dialog
        alertDialog.setIcon(R.drawable.connect_icon);

        // Setting Positive "Yes" Button
        alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

                // Write your code here to invoke YES event
                //Toast.makeText(getApplicationContext(), "You clicked on YES", Toast.LENGTH_SHORT).show();
                initConnections();

            }
        });

        // Setting Negative "NO" Button
        alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to invoke NO event
                Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });

        // Showing Alert Message
        alertDialog.show();
    }

    public void Progress() {
        ProgressDialog progress = new ProgressDialog(this);
        progress.setTitle("Loading");
        progress.setMessage("Wait while loading...");
        progress.show();

    }

    public void showIconWhenConnected() {
        if (mBTService.getMode() == mBTService.SERVER_MODE) {

            if (p1.getVisibility() == View.INVISIBLE) {
                p1.setVisibility(View.VISIBLE);
                p1Activity.setVisibility(View.VISIBLE);
                p1Detected = true;
                return;
            }

            if (p2.getVisibility() == View.INVISIBLE) {
                p2.setVisibility(View.VISIBLE);
                p2Activity.setVisibility(View.VISIBLE);
                p2Detected = true;
                return;
            }

            if (p3.getVisibility() == View.INVISIBLE) {
                p3.setVisibility(View.VISIBLE);
                p3Activity.setVisibility(View.VISIBLE);
                p3Detected = true;
                return;
            }
        }
    }

    public void updateMasterUI(String deviceName, String activity) {

        if (deviceName.equals(detectedDevices.get(0))) {
            updateImageView(p1Activity, activity);
            return;
        }

        if (deviceName.equals(detectedDevices.get(1))) {
            updateImageView(p2Activity, activity);
            return;
        }

        if (deviceName.equals(detectedDevices.get(2))) {
            updateImageView(p3Activity, activity);
            return;
        }

    }

    public void updateImageView(ImageView mImageView, String activity) {
        String uri = "";
        if (activity.equalsIgnoreCase("walking"))
            uri = "@drawable/walking_icon_4";  // where myresource (without the extension) is the file

        if (activity.equalsIgnoreCase("running") || activity.equalsIgnoreCase("cycling"))
            uri = "@drawable/running_img";  // where myresource (without the extension) is the file

        if (activity.equalsIgnoreCase("inactive"))
            uri = "@drawable/standing_img3";  // where myresource (without the extension) is the file

        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        mImageView.setImageDrawable(res);
    }

    public void updateDeviceName(String deviceName) {

        if (p1Name.getText().equals("") && p1Detected && !detectedDevices.contains(deviceName)) {
            p1Name.setVisibility(View.VISIBLE);
            p1Name.setText(deviceName);
            detectedDevices.add(deviceName);
            return;
        }

        if (p2Name.getText().equals("") && p2Detected && !detectedDevices.contains(deviceName)) {
            p2Name.setVisibility(View.VISIBLE);
            p2Name.setText(deviceName);
            detectedDevices.add(deviceName);
            return;
        }

        if (p3Name.getText().equals("") && p3Detected && !detectedDevices.contains(deviceName)) {
            p3Name.setVisibility(View.VISIBLE);
            p3Name.setText(deviceName);
            detectedDevices.add(deviceName);
            return;
        }
    }


}
