node {
   stage('checkout github'){
    git branch: 'master',
           url:  'https://github.com/ShawnSWu/SpringBootWithJenkins.git'
   }
   stage('Build'){
       sh './gradlew build'
   }
   stage('Deploy'){
        withCredentials([sshUserPrivateKey(credentialsId: 'aca911c8-24f7-43ea-a0f1-e163b20a1f97	') {
           sh("git push hewroku master:master")
        }
   }

}