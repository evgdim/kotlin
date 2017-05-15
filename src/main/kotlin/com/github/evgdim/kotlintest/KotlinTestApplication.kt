package com.github.evgdim.kotlintest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinTestApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinTestApplication::class.java, *args)
}
