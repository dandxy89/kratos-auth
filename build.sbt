organization := "com.dandxy89"
scalaVersion := "2.13.1"
version := "0.0.1-SNAPSHOT"
name := "kratos-auth"

lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(
    Defaults.itSettings,
    libraryDependencies ++= ProjectDependencies(),
    ScalacOptions.settings
  )

Test / fork := false
Test / testForkedParallel := false
IntegrationTest / fork := false
IntegrationTest / testForkedParallel := false
publishArtifact := false
publishArtifact in (Compile, packageBin) := true
