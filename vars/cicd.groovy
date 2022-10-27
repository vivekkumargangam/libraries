def newgit(branch,repo)
{
  git branch: '"${branch}"', url: "${'repo'}"
} 
def imagebuilding(imagename,path)
{
  sh 'sudo -S docker build -t "${imagename}" -f Dockerfile "${path}"'
} 
def runcontainer(containername,imagename)
{
  sh 'sudo -S docker run --name "{containername}" -itd "{imagename}"'
} 
def deletecontainer(containername)
{
  sh 'sudo -S docker rm -f "${containername}"'
}  
def copy(sourcepath,destinationpath)
{
  sh 'sudo -S cp -r "${sourcepath}" "${destinationpath}"'
}  
