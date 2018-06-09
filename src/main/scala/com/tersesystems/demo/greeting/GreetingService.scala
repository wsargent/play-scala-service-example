package com.tersesystems.demo.greeting


class GreetingService {

  def greetingMessage(language: String) = language match {
    case "it" => "Messi"
    case _ => "Hello"
  }

  // Create a list of capabilities and revokers
  // Show admin list
  // List of buttons
  // Pass capabilities to akka typed

}