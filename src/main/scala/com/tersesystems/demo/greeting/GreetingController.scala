package com.tersesystems.demo.greeting

import play.api.i18n.Langs
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}
import play.twirl.api.Html

class GreeterController(greetingService: GreetingService,
                        langs: Langs,
                        cc: ControllerComponents) extends AbstractController(cc) {

  private val greetingsList = Greeting(message = "hello", name = "derp")

  def greetings = Action {
    Ok(Json.toJson(greetingsList))
  }

  def greetInMyLanguage = Action {
    Ok(greetingService.greetingMessage(langs.preferred(langs.availables).language))
  }

  def index = Action {
    Ok(Html("<h1>Welcome</h1><p>Your new application is ready.</p>"))
  }

}

