pipeline {
    agent any
    
    stages {
        
        stage('Build') {
            steps {
                // Compile Java code
                sh 'javac HelloWorld.java'
            }
        }
        
        stage('Test') {
            steps {
                // Run unit tests (if applicable)
                echo 'No unit tests for this project'
            }
        }
        
        stage('Deploy') {
            steps {
                // Deployment steps (if applicable)
                echo 'No deployment steps for this project'
            }
        }
    }
}
