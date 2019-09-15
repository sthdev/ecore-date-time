pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'mvn compile -DskipTests=true'
            }
        }
    }
}