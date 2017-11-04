#!/usr/bin/env groovy

pipeline {
    agent none
    stages {
        stage('Build') {
            agent {
                docker {
                    image 'maven:3-alpine'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                echo 'Building..'
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            agent any
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            agent any
//            when {
//                branch 'test'
//            }
            steps {
                echo 'Deploying....'
            }
//            post {
//                always {
//                    mail to: 'arman.fazylov@gmail.com',
//                            subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
//                            body: "Something is wrong with ${env.BUILD_URL}"
//                }
//            }
        }
    }
}