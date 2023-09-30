def call (Map config) {
    if (config.type == "maven") {
        mavenPipelinePipeline()
    }
    else {
        pipeline {
            agent any
            stages {
                stage("Unsupported Pipeline") {
                    steps {
                        script {
                            echo("Unsupported Pipeline")
                        }
                    }
                }
            }
        }
    }
}