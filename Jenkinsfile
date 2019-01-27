node {

    checkout scm

    stage('Print current branch name') {
        println env.BRANCH_NAME
    }

    stage('Create executable .jar test file') {
        sh 'chmod +x gradlew'
        sh './gradlew testJar'
    }

    stage('Run tests from .jar') {
        sh 'java -jar ./build/libs/fun-1.0-SNAPSHOT-tests.jar -p myTests --disable-ansi-colors'
    }
}
