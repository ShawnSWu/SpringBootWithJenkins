node {
   stage('checkout github'){
    git branch: 'master',
           url:  'https://github.com/ShawnSWu/SpringBootWithJenkins.git'
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