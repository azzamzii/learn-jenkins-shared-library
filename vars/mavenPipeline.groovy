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
        }
        stages {
            stage("Maven Compile") {
                steps {
                    script {
                        maven(["compile"])
                    }
                }
            }
        }
        stages {
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