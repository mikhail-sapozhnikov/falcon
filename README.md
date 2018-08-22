# README for the Falcon.io test automation task

### Steps to run tests:

1) Install JDK 8 and Maven on your PC  
JDK: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html  
Maven: https://maven.apache.org/download.cgi  
2) Configure environment variables for JDK 8 and Maven
3) Clone project files to any folder
4) From the src/test/resources folder run below command
For Linux:
```bash
chmod +x chromedriver_linux64
```
For Mac:
```bash
chmod +x chromedriver_mac64
```
3) From the project's root directory run below command (Chrome browser should be installed):
```bash
mvn clean test
```
