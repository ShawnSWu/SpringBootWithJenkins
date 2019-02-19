node {
    stage("clean") {
        cleanWs()
    }
   stage('checkout github'){
    git branch: 'master',
           url:  'https://github.com/ShawnSWu/SpringBootWithJenkins.git'
           sh 'git pull heroku master'
   }
   stage('Build'){
       sh './gradlew build'
   }
   stage('Deploy'){
        git branch: 'master',
        url:  'https://git.heroku.com/jenkinswithspringboot.git'
        sh 'git push heroku master'
   }

}