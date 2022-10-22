#!/usr/bin/groovy
def call() {
    pipeline{
        agent any
        stages{
            stage("scm") {
                steps{
                git url:https://github.com/CyrilFeng/Q-calculator.git;
                    branch:master
                }
            }
            stage('build') {
                   steps{
                sh 'mvn test'
                }
            }
        }
