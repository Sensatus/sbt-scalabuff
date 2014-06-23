import sbt._
import Keys._

object ScalaBuffBuild extends Build {
  lazy val project = Project(
    id = "root",
    base = file("."),
    settings = Defaults.defaultSettings ++ Seq(
      publishTo := {
        val nexus = "https://repo.timetotrade.eu/"
        if (version.value.trim.endsWith("SNAPSHOT"))
          Some("snapshots" at nexus + "content/repositories/snapshots")
        else
          Some("snapshots" at nexus + "content/repositories/sensatus")
      },
      credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
      publishMavenStyle := true,
      pomIncludeRepository := { _ => false },
      publishArtifact in Test := false
    )
  )
}
