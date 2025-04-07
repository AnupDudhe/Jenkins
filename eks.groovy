pipeline {
  agent { label 'webserver' }

  environment {
    AWS_REGION = 'ap-south-1'
    TF_IN_AUTOMATION = 'true'
  }

 

  stages {
    stage('Checkout Code') {
      steps {
        git branch: 'main', url: 'https://github.com/AnupDudhe/terraformeksjenkins.git'
      }
    }

    stage('Terraform Init') {
      steps {
        sh 'terraform init'
      }
    }

    stage('Terraform Plan') {
      steps {
          echo "we are planning"
      //  sh 'terraform plan -out=tfplan'
      }
    }

    stage('Terraform Apply') {
      steps {
        input message: 'Do you want to apply these changes?'
        sh 'terraform destroy -auto-approve'
      }
    }
  }
}
