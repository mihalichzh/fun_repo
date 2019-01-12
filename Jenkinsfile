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
}