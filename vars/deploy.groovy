def call(){
  echo "Deployment started container creating.."
  sh "docker compose up -d"
  echo "Deployment completed"
}
