node {
   stage('checkout'){
          git url: 'https://github.com/ShawnSWu/SpringBootWithJenkins.git', branch: 'master'
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