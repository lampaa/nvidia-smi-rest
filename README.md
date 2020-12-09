**What is it?**

Smi Rest - service for obtaining GPU data in a convenient format and collecting statistics.

**How to install?**

1. For Windows and Linux, needs to install the nvidia driver https://www.nvidia.com/Download/index.aspx
1. For use without containerization, install Java 11 https://adoptopenjdk.net/
1. For use with containerization, install docker, docker-compose https://docs.docker.com/get-docker/
1. To use in Docker, you need to install the NVIDIA Container Toolkit https://docs.nvidia.com/datacenter/cloud-native/container-toolkit/install-guide.html#docker

**Without Docker**

* Package project `maven package`
* Or download release https://github.com/lampaa/nvidia-smi-rest/releases/latest  
* Run `java -jar smirest-0.0.2.jar`

**With Docker**

* Run `docker-compose -d up`

**REST API**

* http://localhost:8169/v1 - get all log from gpu devices
* http://localhost:8169/v1/GPU-UUID - get log from one gpu device
* http://localhost:8176/v1/GPU-a9685d8a-fbf2-7465-ee1f-307141ef06a8/pci/pciGpuLinkInfo/pcieGen - get field from log one gpu device
* http://localhost:8169/stats - get stats from all gpu devices
* http://localhost:8169/stats/GPU-UUID - get stats from one gpu device
* http://localhost:8169/stats/graphs - get stats graphics

![alt text](graphs.png)

**Maven dependency (not worked)**
```xml
<dependency>
    <groupId>com.lampa</groupId>
    <artifactId>smirest</artifactId>
    <version>0.0.2</version>
</dependency>
```

**How to use**

```java
NvidiaSmiLogType smi = SmiReader.read(); // read from system
NvidiaSmiLogType smi = SmiReader.read(new File("smi_log.xml")); // read from xml file
NvidiaSmiLogType smi = SmiReader.read(new FileInputStream("smi_log.xml")); // read from input stream
NvidiaSmiLogType smi = SmiReader.read("<xml>...</xml>"); // from string
NvidiaSmiLogType smi = SmiReader.read(new StringReader("<xml>...</xml>")); // from reader
``` 


**Documentation**

* Swagger http://lampaa.github.io/com.lampa.smirest/swagger/index.html
* JavaDoc http://lampaa.github.io/com.lampa.smirest/docs/index.html