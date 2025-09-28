// build.sc
import mill._, scalalib._, publish._

val spinalVersion = "1.9.4"

trait CommonSpinalModule extends ScalaModule {
  def scalaVersion = "2.12.18"
  override def millSourcePath = os.pwd
  def sources = T.sources(
    millSourcePath / "src"
  )

  def scalacOptions = Seq("-unchecked", "-deprecation", "-feature")

  def ivyDeps = Agg(
    ivy"com.github.spinalhdl::spinalhdl-core:$spinalVersion",
    ivy"com.github.spinalhdl::spinalhdl-lib:$spinalVersion",
  )
  def scalacPluginIvyDeps = Agg(ivy"com.github.spinalhdl::spinalhdl-idsl-plugin:$spinalVersion")
}

object cod25 extends CommonSpinalModule
