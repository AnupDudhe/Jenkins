what is jenkins ?
jenkins is a open source tool , which provides automated continous integration and continous deployment/delivery service.
it works on java dependecy


how to configure jenkins ?
ubuntu

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
sudo systemctl start jenkins#

#few java installation commands
apt-cache search java
 java -version

#install default java 

sudo apt install openjdk -y
sudo apt install default-jre -y
sudo apt install default-jdk -y

#for centos
for centos 
sudo wget -O /etc/yum.repos.d/jenkins.repo \
    https://pkg.jenkins.io/redhat-stable/jenkins.repo
sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io-2023.key
sudo yum upgrade
# Add required dependencies for the jenkins package
sudo yum install fontconfig java-17-openjdk
sudo yum install jenkins
sudo systemctl daemon-reload
