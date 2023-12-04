pipeline{

    agent any

    stages{

        stage('Build Jar'){
            steps{
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Image'){
            steps{
                sh 'docker build -t=marklen1984/selenium:latest .'
            }
        }

        stage('Push Image'){
            environment{
                // assuming you have stored the credentials with this name
                DOCKER_HUB = credentials('dockerhub-creds')
            }
            steps{
                // There might be a warning.
                sh 'docker login -u ${DOCKER_HUB_USR} -p ${DOCKER_HUB_PSW}'
                sh 'docker push marklen1984/selenium:latest'
                sh "docker tag marklen1984/selenium:latest marklen1984/selenium:${env.BUILD_NUMBER}"
                sh "docker push marklen1984/selenium:${env.BUILD_NUMBER}"
            }
        }

    }

    post {
        always {
            sh 'docker logout'
        }
    }

}