package com.tersesystems.demo.services

import com.tersesystems.demo.chatroom.GreetingService

trait ServicesModule {
  import com.softwaremill.macwire._

  lazy val greetingService = wire[GreetingService]
}
