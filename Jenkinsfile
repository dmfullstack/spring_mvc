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
//            agent any
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
                docker.withRegistry('https://ec2-18-216-80-132.us-east-2.compute.amazonaws.com') {
                    docker.image('my-custom-image').inside {
                        sh 'make test'
                    }
                }
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