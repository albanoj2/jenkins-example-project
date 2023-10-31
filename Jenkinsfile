pipeline {
    agent any
	tools {
        maven
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn package'
            }
        }
    }
}