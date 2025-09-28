package cod25

import spinal.core._
import spinal.core.sim._

object Config {
  def spinal = SpinalConfig(
    mode = SystemVerilog,
    targetDirectory = "gen/rtl"
  )

  def sim = SimConfig
    .withConfig(spinal)
    .withVcdWave
}