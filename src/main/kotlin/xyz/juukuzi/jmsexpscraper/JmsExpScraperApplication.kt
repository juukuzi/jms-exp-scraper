package xyz.juukuzi.jmsexpscraper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JmsExpScraperApplication

fun main(args: Array<String>) {
    runApplication<JmsExpScraperApplication>(*args)
}
