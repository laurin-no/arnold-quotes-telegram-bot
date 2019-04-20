

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "arnold-quotes-telegram-bot",
    libraryDependencies ++= Seq(
      "com.bot4s" %% "telegram-core" % "4.0.0-RC2"
    )
  )
  .enablePlugins(JavaServerAppPackaging)
