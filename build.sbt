scalaVersion := "2.12.4"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.11"

JavaUnidoc / unidoc / javacOptions := Seq(
  // https://stackoverflow.com/a/47891403
  "-J-Dhttp.agent=javadoc",
  "-link", "https://docs.oracle.com/javase/8/docs/api/",
  "-link", "https://doc.akka.io/japi/akka/2.5.11"
)

enablePlugins(GenJavadocPlugin, JavaUnidocPlugin)
