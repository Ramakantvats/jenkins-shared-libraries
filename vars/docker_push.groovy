def call(){
  echo "Pushing the docker image on docker hub"
  withCredentials([usernamePassword(credentialsId:"dockerHubCred", passwordVariable:"dockerHubPass", usernameVariable:"dockerHubUser")]){ //extracting the environment variables from jenkins credentials
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}" //login on docker hub using credentials username and pass
  sh " docker image tag django-image:latest ${env.dockerHubUser}/django-image:latest" //changing the name of the image as it is needed to change so that we can push it on dockerhub <username>/imageName:imageTag
  sh "docker push ${env.dockerHubUser}/django-image:latest " //Now pushing the image on docker hub
  echo "Image pushed successfully.."
  }
}
  
