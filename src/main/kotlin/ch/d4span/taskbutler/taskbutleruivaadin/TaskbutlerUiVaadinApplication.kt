package ch.d4span.taskbutler.taskbutleruivaadin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class TaskbutlerUiVaadinApplication

fun main(args: Array<String>) {
    runApplication<TaskbutlerUiVaadinApplication>(*args)
}
