pipeline {
  agent {
    docker {
      image 'maven:3.6.0-jdk-8-alpine'
      args '-v $HOME/.m2:/root/.m2'
    }

  }
  stages {
    stage('build') {
      steps {
        sh 'mvn -B clean compile -DskiptTests=true'
      }
    }
    stage('test') {
      post {
        always {
          junit 'tests/**/target/surefire-reports/**/*.xml'

        }

      }
      steps {
        sh 'mvn -B verify'
      }
    }
  }
}