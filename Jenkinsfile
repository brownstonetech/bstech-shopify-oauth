pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /var/jenkins_home/.m2:/var/jenkins_home/.m2'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'echo "HOME=${HOME}"'
        sh 'mvn -B clean install'
      }
    }

  }
  environment {
    JAVA_TOOL_OPTIONS = '-Duser.home=/var/jenkins_home'
    HOME = '/var/jenkins_home'
  }
}