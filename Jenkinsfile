node {
   stage('checkout github'){
    git branch: 'master',
    url:  'https://github.com/ShawnSWu/SpringBootWithJenkins.git'
   }
   stage('Build'){
       sh './gradlew build'
   }
   stage('Deploy'){
       sh 'git push hewroku master'
   }

}