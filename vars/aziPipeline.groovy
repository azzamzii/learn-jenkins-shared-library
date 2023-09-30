def call () {
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