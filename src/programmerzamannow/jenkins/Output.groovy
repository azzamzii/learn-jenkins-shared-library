package programmerzamannow.jenkins

class Output {

    static def hello (steps, String name) {
        step.echo("Hello ${name}")
    }

}