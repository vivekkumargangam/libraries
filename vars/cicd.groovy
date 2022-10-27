def newgit(branch,repo)
{
  git branch: "${branch}", credentialsId: 'cred', url: "${repo}"
} 
def copy(sourcepath,destinationpath)
{
  sh "sudo -S cp -rf '${sourcepath}' '${destinationpath}'"
}
def imagebuilding(imagename,path)
{
  sh 'sudo -S docker build -t ${imagename} -f Dockerfile ${path}'
} 
def runcontainer(containername,imagename)
{
  sh 'sudo -S docker run --name ${containername} -itd ${imagename}'
} 
def deletecontainer(containername)
{
  sh 'sudo -S docker rm -f ${containername}'
}  

