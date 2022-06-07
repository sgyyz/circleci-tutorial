package com.classpass.api.circlecitutorial.resources

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {

  @GetMapping
  fun greeting(): String = "Hello 57Blockers!"
}