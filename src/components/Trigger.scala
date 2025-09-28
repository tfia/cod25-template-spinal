package cod25

import spinal.core._
import spinal.lib._

class Trigger extends Component {
    var io = new Bundle {
        val push_btn = in Bool()
        val trig = out Bool()
    }
    noIoPrefix()
    io.trig := RegNext(io.push_btn).rise(initAt = False)
}

object TriggerVerilog extends App {
    Config.spinal.generate(new Trigger)
}