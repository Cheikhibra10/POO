pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Check out the code from the Git repository
                git 'https://github.com/Cheikhibra10/POO.git'
            }
        }
        
        stage('Build') {
            steps {
                // Compile Java code
                bat 'javac HelloWorld.java'
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
