pipeline {
  agent {
      label 'autoscale'
  }

  stages {
    stage('Init') {
        steps {
            checkout scm
            sh './gradlew clean'
        }
    }

    stage('Build') {
        steps {
            sh 'env'
            echo  'bob'
            sh 'ls -lah'
        }
    }
    /*
    stage('Dockerize') {
        steps {
            sh 'eval $(AWS_DEFAULT_REGION=us-east-1 AWS_SECRET_ACCESS_KEY=$AWS_KEY_PSW AWS_ACCESS_KEY_ID=$AWS_KEY_USR aws ecr get-login --no-include-email --region us-east-1)'
            sh 'EID_DATABASE_HOST=$EID_DATABASE_HOST EID_DATABASE_USER=$EID_DATABASE_KEY_USR EID_DATABASE_PASSWORD=$EID_DATABASE_KEY_PSW ./gradlew docker dockerPush'
        }
    }

    stage('Deploy') {
        steps {
            sh 'AWS_SECRET_ACCESS_KEY=$AWS_KEY_PSW AWS_ACCESS_KEY_ID=$AWS_KEY_USR ./deploy.sh'
        }
    }
    */
  }
}
