enablePlugins(BuildInfoPlugin)
enablePlugins(DockerPlugin)

organization := "com.greg"

name := "monoids-talk"

scalaVersion := "2.13.0"

resolvers ++= Seq(
  Resolver.mavenLocal
)

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.0.0"
)
