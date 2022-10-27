def newgit(branch,repo)
{
  git branch: "${branch}", credentialsId: 'cred', url: "${repo}"
} 
def imagebuilding(imagename,path)
{
  echo "${imagename}"
  echo "${path}"
  sh 'sudo -S docker build -t ${imagename} -f Dockerfile ${path}'
} 
def runcontainer(containername,imagename)
{
  echo "${containername}"
  echo "${imagename}" 
  sh 'sudo -S docker run --name ${containername} -itd ${imagename}'
} 
def deletecontainer(containername)
{
  echo "${containername}"
  sh 'sudo -S docker rm -f ${containername}'
}  
def copy(sourcepath,destinationpath)
{
  echo "${sourcepath}"
  echo "${destinationpath}" 
  sh 'sudo -S cp -r ${sourcepath} ${destinationpath}'
}
