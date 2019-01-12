node {
     checkout scm

     stage ('Print workspace directory content'){
         def output = sh returnStdout: true, script: 'ls -a'
         println output
     }

     stage ('Run tests via gradle command'){
         sh 'chmod +x gradlew'
         sh './gradlew test'
     }

     stage ('Print current branch name'){
        println env.BRANCH_NAME
     }

     stage ('Create executable .jar test file'){
        sh 'chmod +x gradlew'
        sh './gradlew testJar'
     }

     stage ('Print workspace directory content after jar composed'){
              def output = sh returnStdout: true, script: 'ls -a'
              println output
     }

     stage ('Run tests from .jar'){
        sh 'java -jar ./build/libs/fun-1.0-SNAPSHOT-tests.jar -p myTests --disable-ansi-colors'
     }
}
pipeline {
    agent {
        docker {
            image 'alpine:3.7'
        }
    }
    stages {
        stage('Test docker') {
            steps {
                sh 'whoami'
            }
        }
    }
}