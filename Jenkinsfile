pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat "mvn compile -DskipTests=true"
            }
        }
    }
}