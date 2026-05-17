def call(String imageName , String imageTag , String dockerHubUser){
  echo "docker image creation started"
  sh "docker build -t ${dockerHubUser}/${imageName}$:${imageTag} ." //As we are using shell (sh) here so to use variables we need to use this syntax ${}
  echo "docker image created"
}
