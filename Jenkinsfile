pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
		stage('MutationTesting') {
			steps {
				sh 'mvn pitest:mutationCoverage'
			}
            post {
                always {
                    publishHTML target: [
                        reportName: 'Pi-Test Report',
                        reportDir: 'target/pit-reports',
                        reportFiles: 'index.html', 
                        reportTitles: 'Mutation Testing Report', 
                        keepAll: true,
                        alwaysLinkToLastBuild: true,
                        allowMissing: false
                    ]
                }
            }
		}
		stage('SpotbugsCheck') {
			steps {
				sh 'mvn spotbugs:check'
			}
            post {
                always {
                    publishHTML target: [
                        reportName: 'Spotbugs Report',
                        reportDir: 'target',
                        reportFiles: 'spotbugs.html', 
                        reportTitles: 'Bad Smell Identification Report', 
                        keepAll: true,
                        alwaysLinkToLastBuild: true,
                        allowMissing: false
                    ]
                }
            }
		}
    }
}