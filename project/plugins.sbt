logLevel := Level.Warn

if (file(s"${System.getProperty("user.home")}/.ivy2/artifactory_credentials").exists())
  credentials += Credentials(file(s"${System.getProperty("user.home")}/.ivy2/artifactory_credentials"))
else
  credentials += Credentials(
    "Artifactory Realm",
    "artifactory.ops.babylontech.co.uk",
    sys.props("ARTIFACTORY_USER"),
    sys.props("ARTIFACTORY_PWD"))

resolvers ++= Seq(
  "babylon-snapshots" at "https://artifactory.ops.babylontech.co.uk/artifactory/babylon-maven-snapshots",
  "babylon-releases" at "https://artifactory.ops.babylontech.co.uk/artifactory/babylon-maven-releases"
)

addSbtPlugin("com.babylonhealth" % "ds-common-plugin" % "3.1.4" exclude ("org.apache.maven", "maven-plugin-api"))
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"     % "2.0.0")

