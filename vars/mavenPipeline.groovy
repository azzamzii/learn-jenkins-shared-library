def call() {
    pipeline {
        agent any
        stages {
            stage("Maven Build") {
                steps {
                    script {
                        maven(["clean"])
                    }
                }
            }
            stage("Maven Compile") {
                steps {
                    script {
                        maven(["compile"])
                    }
                }
            }
            stage("Maven Test") {
                steps {
                    script {
                        maven(["test"])
                    }
                }
            }
        }
    }
}