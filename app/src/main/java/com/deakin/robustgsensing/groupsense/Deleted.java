package com.deakin.robustgsensing.groupsense;

public class Deleted {

	// registerReceiver(mScreenReceiver, new IntentFilter(
	// Intent.ACTION_SCREEN_OFF));

	/*
	 * by amin tts = new TextToSpeech(this, this);
	 * 
	 * 
	 * mlocManager = (LocationManager)
	 * getSystemService(Context.LOCATION_SERVICE);
	 * 
	 * Criteria criteria = new Criteria(); provider =
	 * mlocManager.getBestProvider(criteria, false); Location location =
	 * mlocManager.getLastKnownLocation(provider); if (location != null)
	 * onLocationChanged(location);
	 * 
	 * // mlocManager.requestLocationUpdates( // LocationManager.GPS_PROVIDER, 5
	 * * 1000, 0, // LocListener); // if (Globals.getInstance().getDistance() >
	 * 10) { // Globals.getInstance().setReadyToSend(true); //
	 * mlocManager.removeUpdates(LocListener); // }
	 */

	
	
	/*
	 * 
	 * Location prevLoc = null;
	 * 
	 * @Override public void onStatusChanged(String provider, int status, Bundle
	 * extras) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void onProviderEnabled(String provider) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void onProviderDisabled(String provider) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void onLocationChanged(Location loc) { // TODO
	 * Auto-generated method stub Log.i("GPS : ", "Location changed"); //
	 * speakOut("location changed");
	 * 
	 * if (prevLoc == null) prevLoc = loc; else {
	 * 
	 * prevLoc = loc;
	 * Globals.getInstance().setDistance(loc.distanceTo(prevLoc)); } }
	 */

	
	
	
	
	// public BroadcastReceiver mScreenReceiver = new BroadcastReceiver() {
	// public void onReceive(Context context, Intent intent) {
	// if (Intent.ACTION_SCREEN_OFF.equals(intent.getAction())) {
	// Log.d("ACC", "ON");
	// try {
	// ReasoningSensorListener sensorListener = new ReasoningSensorListener(
	// "acceltest.csv", (TextView) findViewById(R.id.info));
	// Sensor desired = getSensor(Sensor.TYPE_ACCELEROMETER,
	// sensorMgr);
	// Log.e("BT", "GOT DATA" + desired);
	// if (desired != null) {
	// sensorMgr.registerListener(sensorListener, desired,
	// SensorManager.SENSOR_DELAY_FASTEST);
	//
	// }
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	//
	// }
	//
	// };
	
	
	
}
