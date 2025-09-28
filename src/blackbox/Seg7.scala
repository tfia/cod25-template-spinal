package cod25

import spinal.core._
import spinal.lib._

class Seg7 extends BlackBox {
    val io = new Bundle {
        val iDIG = in UInt(4 bits)
        val oSEG1 = out Bits(8 bits)
    }
    noIoPrefix()
    setBlackBoxName("SEG7_LUT")
    addRTLPath("verilog/SEG7_LUT.sv") // should be relative from project root
}
