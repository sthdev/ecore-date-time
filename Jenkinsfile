pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat "mvn.cmd compile -DskipTests=true"
            }
        }
    }
}