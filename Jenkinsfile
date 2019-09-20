pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh "mvn -B clean compile -DskiptTests=true"
            }
        }
        stage('test') {
            steps {
                sh "mvn -B verify"
            }
            post {
            	always {
            		junit 'tests/**/target/surefire-reports/**/*.xml'
            	}
            }
        }
    }
}