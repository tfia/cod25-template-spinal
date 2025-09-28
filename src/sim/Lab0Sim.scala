package cod25

import spinal.core._
import spinal.lib.io._
import spinal.sim._
import spinal.core.sim._

import scala.util.Random

import cod25.lab0.Lab0Top
import cod25._

object TestLab0 extends App {
    Config.sim.compile(InOutWrapper(new Lab0Top)).doSim { dut =>
        dut.io.buttons.push_btn #= false

        dut.clockDomain.forkStimulus(10 ns)
        dut.clockDomain.waitSampling()

        var count = 0

        for (_ <- 0 until 20) {
            sleep(100 ns)
            dut.io.buttons.push_btn #= true
            sleep(100 ns)
            dut.io.buttons.push_btn #= false

            if (count < 15) {
                count += 1
            }
            val real = dut.counter.counter.toInt
            assert(real == count, s"Got $real, expected $count")
        }
        sleep(200 ns)
    }
}