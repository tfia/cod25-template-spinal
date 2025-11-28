package cod25

import spinal.core._
import spinal.core.sim._

object Config {
  def spinal = SpinalConfig(
    mode = SystemVerilog,
    targetDirectory = "gen/rtl",
    defaultConfigForClockDomains = ClockDomainConfig(
      resetKind = SYNC,
      resetActiveLevel = HIGH,
    )
  )

  def sim = SimConfig
    .withConfig(spinal)
    .withVcdWave
}