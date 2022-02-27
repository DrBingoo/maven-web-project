pipeline {
    agent any
    tools{
      maven 'maven 3.8.2'
      jdk 'JDK 1.8'
    }
    stages {
        stage("git clone") {
            steps {
                git branch: 'master', url: 'https://github.com/DrBingoo/maven-web-project.git'
            }
        }
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
