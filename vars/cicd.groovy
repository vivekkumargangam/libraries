def newgit(branch,repo)
{
  git branch: "${branch}", credentialsId: 'cred', url: "${repo}"
} 
def imagebuilding(imagename,path)
{
  sudo -S docker build -t "${imagename}" -f Dockerfile "${path}"
} 
def runcontainer(containername,imagename)
{
  sudo -S docker run --name "${containername}" -itd "${imagename}"
} 
def deletecontainer(containername)
{
  sudo -S docker rm -f "${containername}"
}  
def copy(sourcepath,destinationpath)
{
  sudo -S cp -r "${sourcepath}" "${destinationpath}"
} 

