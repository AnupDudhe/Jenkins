pipeline {
  agent {label "webserver"}

  environment {
    AWS_REGION = "ap-south-1"
    TF_IN_AUTOMATION = "true"
  }

  tools {
    terraform 'terraform-latest' // Or whatever name you configured in Jenkins tools
  }

  stages {
    stage('Checkout Code') {
      steps {
        git branch: 'main', url: 'https://github.com/AnupDudhe/terraformeksjenkins.git'
      }
    }

    stage('Terraform Init') {
      steps {
        withCredentials([[
          $class: 'AmazonWebServicesCredentialsBinding',
          credentialsId: 'aws-creds'
        ]]) {
          sh 'terraform init'
        }
      }
    }

    stage('Terraform Plan') {
      steps {
        withCredentials([[
          $class: 'AmazonWebServicesCredentialsBinding',
          credentialsId: 'aws-creds'
        ]]) {
          sh 'terraform plan -out=tfplan'
        }
      }
    }

    stage('Terraform Apply') {
      steps {
        input message: "Do you want to apply these changes?"
        withCredentials([[
          $class: 'AmazonWebServicesCredentialsBinding',
          credentialsId: 'aws-creds'
        ]]) {
          sh 'terraform apply -auto-approve tfplan'
        }
      }
    }
  }
}
