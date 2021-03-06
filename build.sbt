name := """MoerakiKemu"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
  "org.pac4j" % "play-pac4j" % "2.6.1",
  "org.pac4j" % "pac4j-oidc" % "1.9.4" exclude("commons-io" , "commons-io"),
  "commons-io" % "commons-io" % "2.4"
)


fork in run := true

fork in run := true