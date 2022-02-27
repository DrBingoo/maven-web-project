pipeline {
    agent any
    tools{
      maven 'maven 3.8.2'
      jdk 'JDK 1.8'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
