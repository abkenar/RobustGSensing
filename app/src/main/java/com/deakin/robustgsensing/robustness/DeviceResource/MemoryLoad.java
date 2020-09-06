package com.deakin.robustgsensing.robustness.DeviceResource;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

import java.util.Iterator;
import java.util.List;

import static android.content.Context.ACTIVITY_SERVICE;

public class MemoryLoad {

    Context context = this.getApplicationContext();
    ActivityManager mgr = (ActivityManager)context.getSystemService(ACTIVITY_SERVICE);
    List<ActivityManager.RunningAppProcessInfo> processes = mgr.getRunningAppProcesses();
Log.e("DEBUG", "Running processes:");
for(
    Iterator i = processes.iterator(); i.hasNext(); )
    {
        ActivityManager.RunningAppProcessInfo p = (RunningAppProcessInfo)i.next();
        Log.e("DEBUG", "  process name: "+p.processName);
        Log.e("DEBUG", "     pid: "+p.pid);
        int[] pids = new int[1];
        pids[0] = p.pid;
        android.os.Debug.MemoryInfo[] MI = mgr.getProcessMemoryInfo(pids);
        Log.e("memory","     dalvik private: " + MI[0].dalvikPrivateDirty);
        Log.e("memory","     dalvik shared: " + MI[0].dalvikSharedDirty);
        Log.e("memory","     dalvik pss: " + MI[0].dalvikPss);
        Log.e("memory","     native private: " + MI[0].nativePrivateDirty);
        Log.e("memory","     native shared: " + MI[0].nativeSharedDirty);
        Log.e("memory","     native pss: " + MI[0].nativePss);
        Log.e("memory","     other private: " + MI[0].otherPrivateDirty);
        Log.e("memory","     other shared: " + MI[0].otherSharedDirty);
        Log.e("memory","     other pss: " + MI[0].otherPss);

        Log.e("memory","     total private dirty memory (KB): " + MI[0].getTotalPrivateDirty());
        Log.e("memory","     total shared (KB): " + MI[0].getTotalSharedDirty());
        Log.e("memory","     total pss: " + MI[0].getTotalPss());
    }

}
