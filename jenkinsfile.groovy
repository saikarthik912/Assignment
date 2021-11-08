pipeline{
  agent any
  stages{
    stage('Git-Checkout'){
      steps{
        script{
            cleanWs()
           git url: 'https://github.com/saikarthik912/Assignment.git', branch: 'master'
        }
      }
    }
    stage('Build-and-Deploy'){
      steps{
        script{
            sh "chmod -R 777 ."
            echo "Build and Deploy"
            sh "ls -la"
            sh "docker ps"
           sh "docker images"
            sh "docker-compose down --rmi local --remove-orphans"
            sh "docker-compose up --build -d"
        }
      }
    }
  }
}
