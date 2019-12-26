package ch.d4span.taskbutler.ui.vaadin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["ch.d4span.taskbutler"])
open class TaskbutlerVaadinApplication

fun main(args: Array<String>) {
    runApplication<TaskbutlerVaadinApplication>(*args)
}
