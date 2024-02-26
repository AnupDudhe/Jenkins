pipeline {
    agent { 
        label 'simple' 
        }
    stages {
        stage('git commit') {
            steps {
                echo 'welcome to declerative pipeline'
                  }
             }
        stage('extract') {
            steps {
                sh '''
                echo "welocme to declerative pipeline"
                sudo apt-get update -y
                sudo apt install apache2 -y
                sudo systemctl start apache2
                sudo wget https://www.free-css.com/assets/files/free-css-templates/download/page296/oxer.zip
                  '''
            }
        }
        stage('installzip') {
            steps {
            sh '''
              echo "welcome to deployment satage"
              sudo apt install unzip -y
              sudo unzip oxer.zip


            '''
            }
        }
        stage('startingapache') {
            steps {
            sh '''
                echo 'pull github repositery'
                sudo rm -rf /var/www/html/index.html
                sudo mv oxer-html/* /var/www/html/
                

                
            
            '''

            }
        }
    }
}