name := """play-scala-service-example"""

version := "2.6.x"

lazy val root = (project in file(".")).enablePlugins(PlayService)

scalaVersion in ThisBuild := "2.12.6"

libraryDependencies += guice
libraryDependencies += akkaHttpServer
libraryDependencies += filters

libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.3.1" % "provided"

libraryDependencies += "com.typesafe.akka" %% "akka-typed" % "2.5.6"
//
//libraryDependencies += "org.julienrf" %% "endpoints-algebra" % "0.5.0"
//libraryDependencies += "org.julienrf" %% "endpoints-algebra-playjson" % "0.5.0"
//libraryDependencies += "org.julienrf" %% "endpoints-play-server" % "0.5.0"
//
//libraryDependencies += "org.julienrf" %% "endpoints-openapi-json-schema-generic" % "0.5.0"

libraryDependencies += "net.logstash.logback" % "logstash-logback-encoder" % "4.11"

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
