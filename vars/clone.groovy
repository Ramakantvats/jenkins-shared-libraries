def call(String url , String branch){
  echo "Cloning the project"
  git url: url, branch: branch
  echo "Code cloned successfully"
}
