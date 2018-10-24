pipeline {
  agent {
      label 'autoscale'
  }
  environment {
     AWS_KEY = credentials('aws-keys')
     CLUSTER_NAME = credentials("CLUSTER_NAME")
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
            sh './gradlew bootJar'
            archiveArtifacts artifacts: 'build/libs/*.jar', fingerprint: true
        }
    }

    stage('Dockerize') {
        steps {
            sh 'eval $(AWS_DEFAULT_REGION=us-east-1 AWS_SECRET_ACCESS_KEY=$AWS_KEY_PSW AWS_ACCESS_KEY_ID=$AWS_KEY_USR aws ecr get-login --no-include-email --region us-east-1)'
            sh './gradlew docker dockerPush'
        }
    }

    stage('Deploy') {
        steps {
            sh 'AWS_SECRET_ACCESS_KEY=$AWS_KEY_PSW AWS_ACCESS_KEY_ID=$AWS_KEY_USR ./deploy.sh'
        }
    }
  }
}
