def call(List command) {
    for (command in commands) {
        sh("./mvnw ${command}")
    }
}