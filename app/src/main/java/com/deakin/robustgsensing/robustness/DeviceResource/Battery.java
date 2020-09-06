package com.deakin.robustgsensing.robustness.DeviceResource;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Battery {


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

            //context.unregisterReceiver();
            Log.i("BT", "batteryInfoReceiver Unregistered");

        }
    };

}
