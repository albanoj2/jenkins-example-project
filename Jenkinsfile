pipeline {
    agent { 
    	docker { 
    		image 'maven:latest' 
		} 
	}
	tools {
        maven 'maven-3.9.5' 
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn package'
            }
        }
    }
}