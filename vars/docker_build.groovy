def call(String imageName , String imageTag , String dockerHubUser){
  echo "docker image creation started"
  sh "docker build -t dockerHubUser/imageName:imageTag ."
  echo "docker image created"
}
