package com.kubecorda.camelk.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CamelKDemoApplication

fun main(args: Array<String>) {
	runApplication<CamelKDemoApplication>(*args)
}
