import Dependencies._

lazy val root = (project in file("."))
  .settings(
    name := "scala-xml-example",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.4",
    libraryDependencies ++= Seq(
      xml
    )
  )