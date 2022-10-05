pipeline{
    agent any
    stages{
        stage('Init'){
            steps{
                echo "this is step-1 from stage-init"
            }
        }
        stage('Build'){
            steps{
                echo "this is step-1 from stage-Build"
            }
        }
        stage('Test'){
            steps{
                echo "this is step-1 from stage-Test"
                echo "this is step-2 from stage-Build"
                echo "this is step-3 from stage-Build"
            }
        }
        stage('Deploy'){
            steps{
                 echo "this is step-1 from stage-Deploy"
            }
        }
    }
}