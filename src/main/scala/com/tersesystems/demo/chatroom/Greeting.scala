package com.tersesystems.demo.chatroom

import play.api.libs.json._

case class Greeting(id: Int = -1, message: String, name: String)

object Greeting {
  implicit val GreetingFormat: Format[Greeting] = Json.format[Greeting]
}