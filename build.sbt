sbtPlugin := true

name := "sbt-scalabuff"

version := "1.3.8-SNAPSHOT"

organization := "com.sensatus.sbt"

crossBuildingSettings

CrossBuilding.crossSbtVersions := Seq("0.12", "0.13")
