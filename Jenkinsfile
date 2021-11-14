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
  environment {
    EMAIL_TO = 'obyivan@gmail.com'
  }
  post {
    success {
      emailext(attachLog: true, body: "Success build in project:$PROJECT_NAME with number build:$BUILD_NUMBER", to: "${EMAIL_TO}", subject: 'Success: $PROJECT_NAME - #$BUILD_NUMBER')
    }

    failure {
      emailext(attachLog: true, body: "Failed \"${FAILED_STAGE}\"", subject: 'Failed: $PROJECT_NAME - #$BUILD_NUMBER', to: "${EMAIL_TO}", from: 'jenkins@example.com')
    }

  }
}