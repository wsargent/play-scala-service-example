package com.tersesystems.demo.chatroom

import com.tersesystems.demo.services.ServicesModule
import play.api.i18n.Langs
import play.api.mvc.ControllerComponents

trait GreetingModule extends ServicesModule {

  import com.softwaremill.macwire._

  lazy val greeterController: GreeterController = wire[GreeterController]

  def langs: Langs

  def controllerComponents: ControllerComponents
}