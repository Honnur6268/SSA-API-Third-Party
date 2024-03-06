pipeline{
    agent any
    
    tools{
        maven 'maven-3'
    }
    
    stages{
        stage('git clone'){
            steps{
                git branch: 'main', url: 'https://github.com/Honnur6268/SSA-API-Third-Party.git'
            }
        }
        stage('maven build'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('docker image'){
            steps{
                sh 'docker build -t 7256268/ssa-api .'
            }
        }
        stage('docker push'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u 7256268 -p ${dockerhubpwd} '
                    }
                    sh 'docker push 7256268/ssa-api'
                }
            }
        }
    }
}