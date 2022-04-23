def newgit(repo)
{
  git "${repo}"
} 
def newmaven()
{
  sh 'mvnpackage'
}  
