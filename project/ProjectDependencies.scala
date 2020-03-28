import sbt._

object ProjectDependencies extends {

  private[this] object Version {
    val argonPass        = "2.6"
    val profigVersion    = "2.3.8"
    val scalaTestVersion = "3.1.1"
  }

  def apply(): Seq[ModuleID] = Seq(
    // Project dependencies
    "de.mkammerer"  % "argon2-jvm" % Version.argonPass,
    "com.outr"      %% "profig"    % Version.profigVersion,
    "org.scalatest" %% "scalatest" % Version.scalaTestVersion % "it, test",
    // Compiler Plugins
    compilerPlugin("org.typelevel" %% "kind-projector"     % "0.11.0" cross CrossVersion.full),
    compilerPlugin("com.olegpy"    %% "better-monadic-for" % "0.3.1")
  )
}
