node {
     properties([
       parameters([
         booleanParam(name: 'submodule', defaultValue: false),
         booleanParam(name: 'submodule_branch', defaultValue: false),
         booleanParam(name: 'commit_sha', defaultValue: false),
       ])
     ])

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
    agent {dockerfile true}
    stages {
            stage('Test') {
                steps {
                    sh 'chmod +x gradlew'
                    sh './gradlew testJar'
                    sh 'java -jar ./build/libs/fun-1.0-SNAPSHOT-tests.jar -p myTests --disable-ansi-colors'
                    }
                }
            }
    }