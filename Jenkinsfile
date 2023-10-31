pipeline {
    agent { 
    	docker { 
    		image 'maven:latest' 
		} 
	}
	tools {
        maven 'Maven 3.8.6' 
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn package'
            }
        }
    }
}