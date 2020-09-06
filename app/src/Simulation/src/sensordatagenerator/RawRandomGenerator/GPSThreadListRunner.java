/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//handle all threads for generating GPS Data
public class GPSThreadListRunner extends Thread {

    Map<String, GPSDataGeneratorThread> GPSThreadsMap;
    List<GPSDataGeneratorThread> GPSThreadsList;

    GPSThreadListRunner(Map<String, GPSDataGeneratorThread> gpsThreadMap) {
        this.GPSThreadsMap = gpsThreadMap;
    }

    public GPSThreadListRunner(List<GPSDataGeneratorThread> GPSThreadsList) {
        this.GPSThreadsList = GPSThreadsList;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();

        //calculate next thread delay
        GPSDataGenerator gpsSimulator = new GPSDataGenerator();

        GPSDataGeneratorThread previous = null;
        GPSDataGeneratorThread current = null;

//        while (it.hasNext()) {
//            Map.Entry pair = (Map.Entry) it.next();
//            System.out.println(pair.getKey().toString() + " = " + pair.getValue());
//
//            //start and sleep threads here...
//            current = GPSThreadsMap.get(pair.getKey());
//
//            if (previous != null) {
//                if (current.starTime > previous.starTime) {
//                    try {
//                        //delay
//                        System.out.println("GPS Thread Delayed ");
//                        Thread.sleep(current.starTime - previous.starTime);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(GPSThreadListRunner.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//
//                } else {
//                    System.out.println("GPS Thread Started ");
//                    current.start();
//                }
//            } else // first thread --> previous is null
//            {
//                System.out.println("GPS Thread Started ");
//                current.start();
//            }
//
//            previous = current;
//        }
        for (int i = 0; i < GPSThreadsList.size(); i++) {

            current = GPSThreadsList.get(i);

            if (previous != null) {
                if (current.starTime - previous.starTime > 0) {
                    try {
                        //delay
                        System.out.println("GPS Thread Delayed");
                        Thread.sleep(current.starTime - previous.starTime);
                        current.start();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GPSThreadListRunner.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    System.out.println("GPS Thread Started ");
                    current.start();
                }
            } else // first thread ,  runs only once 
            {
                System.out.println("First GPS Thread Started From");
                current.start();
            }

            //calculate next thread delay
            previous = current;
            // if (gpsThreadList.get(i).)
        }

    }

}
