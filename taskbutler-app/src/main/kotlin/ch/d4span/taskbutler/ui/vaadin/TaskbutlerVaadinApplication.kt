package ch.d4span.taskbutler.ui.vaadin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class TaskbutlerVaadinApplication

fun main(args: Array<String>) {
    runApplication<TaskbutlerVaadinApplication>(*args)
}
