import sbt.Resolver

name := "WTEC_Shogi"
organization := "de.htwg.se"
version := "3.0.0"
scalaVersion := "2.12.7"
scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

scapegoatVersion in ThisBuild := "1.3.8"

resolvers += Resolver.jcenterRepo

libraryDependencies += "org.scalamock" %% "scalamock" % "4.1.0" % Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % Test

libraryDependencies += "junit" % "junit" % "4.8" % "test"
libraryDependencies += "org.scala-lang" % "scala-swing" % "2+"
libraryDependencies += "com.google.inject" % "guice" % "3.0"
libraryDependencies += "net.codingwell" %% "scala-guice" % "4.1.0"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.6"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.1.1"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.11"
libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % "10.1.1"
libraryDependencies += "org.jsoup" % "jsoup" % "1.9.1"

parallelExecution in Test := false
libraryDependencies += "com.typesafe.slick" %% "slick" % "3.2.0"
libraryDependencies += "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0"
libraryDependencies += "com.typesafe.slick" %% "slick-codegen" % "3.2.1"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.34"
libraryDependencies += "com.typesafe" % "config" % "1.3.1"

libraryDependencies += "org.mongodb" %% "casbah" % "3.1.1"
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.2.0"
libraryDependencies += "org.mongodb" % "mongo-java-driver" % "3.6.0"
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-bson" % "2.1.0"


//Excluded packages and files in coveralls (in REGEX) (hier nur die aview)
coverageExcludedPackages := "<empty>;.*aview.*"
