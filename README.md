# _RobustGSensing_

### Resource-Efficient Opportunistic Stream Reasoning using  Proactive Edge Computing for the Internet-of-Things.

***


The aim of this project is to develop a lightweight middleware (with programming interface) for efficient data stream processing and reasoning with large volumes of streaming data emerging from the network of devices carried by and worn by a user (which we call the Personal Network of Devices).


This work develops and demonstrates a novel prototype of a new middleware in line with the serverless computing theme where from the perspective of developers, code is written and uploaded and jobs processed without worrying about where the resources are situated, be in at edge devices or on remote clouds or a combination thereof.

<p style='text-align: justify;'>
We have employed a peer-to-peer (P2P) model, with a super-peer playing the role of the coordinator. The super-peer will normally be a more resource-rich device and different devices can take up this role at different times. Devices can connect with each other via the super-peer. Any of the peers can be emitting data streams depending on their capabilities.
From the perspective of the programmer, we will develop a tool where functions/jobs are created and the system takes care of resource scaling and management, fault tolerance, deployment, and operations. The architecture of the proposed middleware is illustrated in
</p>


![Alt text](https://github.com/abkenar/RobustGSensing/blob/master/figures/robustgsensing.png "RobustGSensing")

***

### Packages

This framework consists of three main packages as can be seen in the follwoing image: 

* #### _GroupSense_:
 GroupSense recognizes physical activities of a group using wearable sensors.
* #### _HoneyBee_:
 HoneyBee is an opportunistic offloading model for mobile edge crowds for forming device clouds on the fly. In the Honeybee model, mobile devices can share work using p2p connectivity.

* #### _Robustness_ :
Robustness handles a robust P2P connections between devices.    


![Alt text](https://github.com/abkenar/RobustGSensing/blob/master/figures/packages.png "Project Packages")


***

  ### _GronustSense-Sim_ (Simulator)

In order to run our scenario in larger scale scenarios and in a more realistic manner, a sensor data simulator called GroupSense-Sim was built to generate the required sensor data based on real data which was collected beforehand. The simulator is able to generate accelerometer data for a range of atomic activities (such as walking, running, standing, cycling and jogging) from two sources: a smartphone and a smartwatch. The simulator can generate random coordinates for individuals with a given starting point and route path for a certain period of time for a given activity. For example, by defining an expression and passing arguments: an activity (for instance walking), start time, end time, route path and individual/group, the simulator generates the GPS data.

```java
gpsModelList = new ArrayList<GPSSimModel>();

Route waypoints = new Route(new Location("Waypoint 1", -37.7000688,
145.0462786));

Location initLocation = new Location("initLoc", -37.7024212, 145.044288);

GPSSimModel gpsModel = new GPSSimModel(initLocation, waypoints, p3,
Activity.ActivityName.walking, "2016-04-20 19:20:10",
"2016-04-20 19:20:30");

gpsModelList.add(gpsModel);

```
***

### Used Dataset

https://sites.google.com/site/groupsense2018/datasets

https://archive.ics.uci.edu/ml/machine-learning-databases/00240/UCI HAR Dataset.zip

***

### Technology Stack
* Android SDK
* Java (for Simulator)
* FireBase
* Android SDK
* TensorFlow 

***

### Prototype Screenshots

Here is a screenshot of our framework running in four connected device using WiFi Direct:

![Alt text](https://github.com/abkenar/RobustGSensing/blob/master/figures/screenshot1.jpg "Screenshot")


Also, we used Temi robot in our prototype implementation as edge node which have adds more sensing power and movement capability to our framework for more complex scenarios.   

![Alt text](https://github.com/abkenar/RobustGSensing/blob/master/figures/screenshot2.jpg "Screenshot")


───vcsMetadata-1
│   ├───buildOutputCleanup
│   └───vcs-1
├───.idea
│   ├───caches
│   ├───codeStyles
│   └───libraries
├───app
│   ├───libs
│   └───src
│       ├───androidTest
│       │   └───java
│       │       └───com
│       │           └───deakin
│       │               └───robustgsensing
│       ├───HARTensorFlow
│       │   ├───.idea
│       │   ├───data
│       │   └───UCIHARDataset
│       │       ├───test
│       │       │   └───Inertial Signals
│       │       └───train
│       │           └───Inertial Signals
│       ├───main
│       │   ├───java
│       │   │   └───com