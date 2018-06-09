package com.tersesystems.demo.services

import com.tersesystems.demo.greeting.GreetingService

trait ServicesModule {
  import com.softwaremill.macwire._

  lazy val greetingService = wire[GreetingService]
}
