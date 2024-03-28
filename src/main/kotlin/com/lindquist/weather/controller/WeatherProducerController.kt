package com.lindquist.weather.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/weather/producer")
class WeatherProducerController {
    @GetMapping("/health")
    fun health(): ResponseEntity<String> {
        println("Health check")
        return ResponseEntity.ok().body("OK")
    }
}