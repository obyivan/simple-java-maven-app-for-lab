pipeline {
  agent any
  stages {
    stage('Ok') {
      steps {
        echo 'Ok'
        git(url: 'git@github.com:obyivan/simple-java-maven-app-for-lab.git', branch: 'ipokaliuk', credentialsId: 'git-ipokaliuk-ssh')
      }
    }

  }
  post {
    always {
      emailext(body: 'A Test EMail', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test')
    }

  }
}