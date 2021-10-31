package net.dezang.amolang

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AmolangApplication

fun main(args: Array<String>) {
    runApplication<AmolangApplication>(*args)
}
