pipeline {
  agent {
    label 'master'
  }
  stages {
    stage('Stage 1') {
      steps {
        script {
          FAILED_STAGE=env.STAGE_NAME
          echo "stage 1"
        }

      }
    }

    stage('Stage 2') {
      steps {
        script {
          FAILED_STAGE=env.STAGE_NAME
          echo "stage 2"
          error "failed for some reason."
        }

      }
    }

    stage('Stage 3') {
      steps {
        script {
          FAILED_STAGE=env.STAGE_NAME
          echo "stage 3"
        }

      }
    }

  }
  post {
    success {
      emailext(body: '', to: "${EMAIL_TO}", subject: 'Build success in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER')
    }

    failure {
      emailext(body: '', to: "${EMAIL_TO}", subject: 'Build failed in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER')
    }

  }
}