pipeline {
    agent any 
    stages{
        stage("create") {
            steps{
                echo "we are creating a directory"
                sh '''
                mkdir batch24
                '''
            }
        }
        stage("create_file") {
            steps{
                echo "we are creating a file"
                sh '''
                touch batch24.txt
                '''
            }
        }
        stage("insert") {
            steps{
                sh '''
                echo "hello batch24" >> batch24.txt
                '''
            }
        }
        stage("git_operation"){
            steps{
                 
                 git 'https://github.com/AnupDudhe/studentapp-ui.git'
            }
        }
    }







}
