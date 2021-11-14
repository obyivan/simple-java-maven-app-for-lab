pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        echo 'Ok'
        git(url: 'git@github.com:obyivan/simple-java-maven-app-for-lab.git', branch: 'ipokaliuk', credentialsId: 'git-ipokaliuk-ssh')
      }
    }

    stage('Build') {
      steps {
        sh 'ls -la'
        sh 'mvn package'
        emailext(attachLog: true, body: 'This is the extended email test', subject: 'This is the extended email test', to: 'obyivan@gmail.com')
      }
    }

  }
  tools {
    maven 'mvn3'
    jdk 'openjdk8'
  }
  post {
    always {
      emailext(body: 'A Test EMail', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test')
    }

  }
}