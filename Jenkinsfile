pipeline {
  agent {
    docker {
      image 'maven:3.6.0-jdk-8-alpine'
      args '-v $HOME/.m2:/root/.m2 -v $HOME/dev-tools/updatesites:/var/updatesites'
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
    stage('deploy dev update site') {
      steps {
        sh 'mkdir /var/updatesites/dev'
        sh 'mkdir /var/updatesites/dev/ecoretime'
        sh 'cp -rv ./releng/io.github.sthdev.ecoretime.updatesite/target/repository/* /var/updatesites/dev/ecoretime/' 
      }
    }
  }
}