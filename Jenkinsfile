node {
   stage('checkout github'){
    git branch: 'master',
           url:  'https://github.com/ShawnSWu/SpringBootWithJenkins.git'
   }
   stage('Build'){
       sh './gradlew build'
   }
   stage('Deploy'){
        git url: "ssh://jenkins@your-git-repo:12345/https://git.heroku.com/jenkinswithspringboot.git",
            credentialsId: 'jenkins_ssh_key',
            branch: master


        sh 'git push hewroku master'


        withCredentials([sshUserPrivateKey(credentialsId: 'aca911c8-24f7-43ea-a0f1-e163b20a1f97	') {
           sh("git push hewroku master:master")
        }
   }

}