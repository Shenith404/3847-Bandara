pipeline {
  agent any
  triggers{
    githubPush()
  }
  stages {
    stage('build'){
      steps {
        sh 'docker build -t shenith404/3847-node-app-image .'
      }
    }
    stage('run'){
      steps{
        sh 'docker run -d -p 5000:3000 shenith404/3847-node-app-image'
      }
    }
    stage('final'){
      steps{
        sh 'docker ps'
      }
    }
    stage('push'){
      steps{
        script{
          withCredentials([string(credentialsId: 'pwd', variable: 'my-secret')]) {
    sh 'docker login -u shenithbandara -p ${pwd}'
}
        
          
    sh 'docker push henith404/3847-node-app-image'
        }
      }
    }
  }
}


