# RobustGSensing
Resource-Efficient Opportunistic Stream Reasoning using Proactive Edge Computing for the Internet-of-Things



The aim of this proposal is to develop a lightweight middleware (with programming interface) for efficient data stream processing and reasoning with large volumes of streaming data emerging from the network of devices carried by and worn by a user (which we call the Personal Network of Devices).


this work will develop and demonstrate a novel prototype of a new middleware in line with the serverless computing theme where from the perspective of developers, code is written and uploaded and jobs processed without worrying about where the resources are situated, be in at edge devices or on remote clouds or a combination thereof.

We have employed a peer-to-peer model, with a super-peer playing the role of the coordinator. The super-peer will normally be a more resource-rich device and different devices can take up this role at different times. Devices can connect with each other via the super-peer. Any of the peers can be emitting data streams depending on their capabilities. 
From the perspective of the programmer, we will develop a tool where functions/jobs are created and the system takes care of resource scaling and management, fault tolerance, deployment, and operations. The architecture of the proposed middleware is illustrated in

![Alt text](https://github.com/abkenar/RobustGSensing/blob/master/figures/robustgsensing.png "RobustGSensing")




![Alt text](https://github.com/abkenar/RobustGSensing/blob/master/figures/packages.png "Project Packages")
