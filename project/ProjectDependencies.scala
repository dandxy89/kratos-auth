import sbt.{ ModuleID, compilerPlugin, _ }

object ProjectDependencies extends {

  private[this] object Version {
    val argonPass        = "2.5"
    val doobieVersion    = "0.7.1"
    val profigVersion    = "2.3.4"
    val scalaTestVersion = "3.0.5"
  }

  def apply(): Seq[ModuleID] = Seq(
    // Project dependencies
    "de.mkammerer"  % "argon2-jvm"   % Version.argonPass,
    "org.tpolecat"  %% "doobie-core" % Version.doobieVersion,
    "com.outr"      %% "profig"      % Version.profigVersion,
    "org.scalatest" %% "scalatest"   % Version.scalaTestVersion % "it, test",
    // Compiler Plugins
    compilerPlugin("org.spire-math" %% "kind-projector"     % "0.9.4"),
    compilerPlugin("com.olegpy"     %% "better-monadic-for" % "0.3.0-M4")
  )
}
