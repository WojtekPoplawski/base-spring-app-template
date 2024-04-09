package com.wojtekpoplawski.basespringapptemplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BaseSpringAppTemplateApplication

fun main(args: Array<String>) {
	runApplication<BaseSpringAppTemplateApplication>(*args)
}
