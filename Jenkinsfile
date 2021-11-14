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
        sh 'mvn -f pom.xml package'
      }
    }

  }
  post {
    always {
      emailext(body: 'A Test EMail', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test')
    }

  }
}