name := "scala-rest-server"

version := "1.0-SNAPSHOT"


scalaVersion := "2.11.7"

val sprayVersion = "1.3.4"
val akkaVersion = "2.5.17"

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "io.spray" %% "spray-can" % sprayVersion,
    "io.spray" %% "spray-routing" % sprayVersion,
    "org.json4s" %% "json4s-native" % "3.3.0"
)

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
    "io.spray" %% "spray-testkit" % sprayVersion % "test",
    "org.scalatest" %% "scalatest" % "2.2.5" % "test"
)

