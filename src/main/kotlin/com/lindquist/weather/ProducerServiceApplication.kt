package com.lindquist.weather

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WeatherPassThroughServiceApplication

fun main(args: Array<String>) {
	runApplication<WeatherPassThroughServiceApplication>(*args)
}
