pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat "mvn -B compile -DskiptTests=true"
            }
        }
    }
}