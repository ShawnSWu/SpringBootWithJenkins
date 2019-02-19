node {
   stage('checkout'){
        checkout scm
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