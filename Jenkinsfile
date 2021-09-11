pipeline {
    agent any
  //triggers {pollSCM('* * * * *')}
  stages {
    stage('Checkout') {
      steps {
        // Get some code from a GitHub repository
        git branch: "main", url: 'https://github.com/shahidraza77/SpringJpa.git'
      }
    }
        stage('Build') {
      steps {
        sh 'chmod a+x mvnw'
        sh './mvnw clean package -DskipTests=true'
      }
          post {
        always {
          archiveArtifacts 'target/*.jar'
        }
          }
        }
        stage('DockerBuild') {
      steps {
        sh 'docker build -t springjpa/springjpa-app.'
      }
        }
         stage('DockerRun') {
      steps {
        sh 'docker run -d --rm -p 9090:9091 springjpa/springjpa-app'
      }
        }
  }
}