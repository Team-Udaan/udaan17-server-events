package `in`.udaan17.server.events

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Creator: vbarad
 * Date: 2017-02-24
 * Project: events-server
 */

@SpringBootApplication
open class App

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}
