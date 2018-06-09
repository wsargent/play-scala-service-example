package com.tersesystems.demo.greeting

import akka.typed.Behavior
import akka.typed.scaladsl.Actor

object Greeter1 {
  sealed trait Command
  case object Greet extends Command
  final case class WhoToGreet(who: String) extends Command

  val greeterBehavior: Behavior[Command] =
    Actor.mutable[Command](ctx => new Greeter1)
}

class Greeter1 extends Actor.MutableBehavior[Greeter1.Command] {
  import Greeter1._

  private var greeting = "hello"

  override def onMessage(msg: Command): Behavior[Command] = {
    msg match {
      case WhoToGreet(who) =>
        greeting = s"hello, $who"
      case Greet =>
        println(greeting)
    }
    this
  }
}