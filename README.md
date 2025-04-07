### What is Jenkins ? </br>
Jenkins is an open source continuous integration/continuous delivery and deployment (CI/CD) automation software DevOps tool written in the Java programming language. It is used to implement CI/CD workflows, called pipelines.it is used for automating the various stages of software development such as build, test, and deployment.

### History of Jenkins
Jenkins is an open-source automation server that helps automate the building, testing, and deployment of software applications. It was originally developed by Kohsuke Kawaguchi in 2004 as Hudson but was later renamed Jenkins due to trademark issues.

### How to configure jenkins ?
Ubuntu

```
#!/bin/bash
sudo -i
sudo wget -O /usr/share/keyrings/jenkins-keyring.asc \
  https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key
echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] \
  https://pkg.jenkins.io/debian-stable binary/ | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null
sudo apt-get update
sudo apt-get install jenkins -y
sudo apt install openjdk-11-jre-headless -y
sudo systemctl start jenkins
update-alternatives --config java

```


### Few java installation commands
```
apt-cache search java
java -version
```

### Install default java 

```
sudo apt install openjdk -y
sudo apt install default-jre -y
sudo apt install default-jdk -y
```
 

### For centos
```
sudo wget -O /etc/yum.repos.d/jenkins.repo \
    https://pkg.jenkins.io/redhat-stable/jenkins.repo
sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io-2023.key
sudo yum upgrade
```

### Add required dependencies for the jenkins package
```
sudo yum install fontconfig java-17-openjdk
sudo yum install jenkins
sudo systemctl daemon-reload
```
### Maven phases online documentation and maven repository to refer 
```
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
https://mvnrepository.com/
```
### jenkins installation doc and pipeline syntax
```
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

https://www.jenkins.io/doc/book/pipeline/
```
### jenkins plugin url
```
https://plugins.jenkins.io/

/var/lib/jenkins/secrets# cat initialAdminPassword 
```

### change java version 
```
sudo update-alternatives --config java   - for ubuntu
sudo alternatives --config java  - for redhat based
```
     
