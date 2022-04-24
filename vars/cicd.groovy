def newgit(repo)
{
  git "${repo}"
} 
def newmaven()
{
  sh 'mvn package'
} 
def newdeploy(ip,appname)
{
  deploy adapters : [tomcat9(credentialsId: 'b0c1e30f-6a32-4786-871c-342a7de2ad94', path: '', url: "${ip})], contextPath: '"${appname}"', war: '**/*.war'
}  
