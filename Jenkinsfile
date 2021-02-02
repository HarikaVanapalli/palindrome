pipeline {
environment { 
       reg = "harika9391/palindrome" 
	   registryCredential = 'doc_id' 
       dockerImage = '' 
    }
    agent any
    
    stages {
         stage("java compile") {
            steps {
                sh '''
                 javac *.java
                '''
            }
        }
         stage('Java pacakge') {
         
         steps {
          sh 'jar cfe Palindrome.jar Palindrome *.class'
         }
	   }
	   
        stage('Docker image build') {
          
		  steps {
            script { 
                    dockerImage = docker.build reg + ":$BUILD_NUMBER" 
                }
		    }
         }
		 
		 stage('Deploy our image') { 

            steps { 

                script { 

                    docker.withRegistry( '', registryCredential ) { 

                        dockerImage.push() 
                    }

                } 

            }

        } 

        stage('Cleaning up') { 

            steps { 

                sh "docker rmi $reg:$BUILD_NUMBER" 

            }

        } 

    }

}



