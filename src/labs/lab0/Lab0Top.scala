package cod25.lab0

import spinal.core._
import spinal.lib._

import cod25._

class Lab0Top extends ThinPadTop(ThinPadIoConfig(
    enableBaseRam = false,
    enableExtRam = false,
    enableUart = false,
)) {
    val counter = new Counter
    val trigger = new Trigger
    val seg_7 = new Seg7

    trigger.io.push_btn := io.buttons.push_btn
    counter.io.trigger := trigger.io.trig
    seg_7.io.iDIG := counter.io.count
    io.gpio.dpy0 := seg_7.io.oSEG1

    io.gpio.dpy1 := 0
    io.gpio.leds := 0
}

object GenerateLab0 extends App {
    Config.spinal.generate(new Lab0Top)
}