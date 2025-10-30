# cod25-template-spinal

Thinpad_top in Scala with SpinalHDL. Lab0 was completed as an example.

Build with mill.

To generate SystemVerilog:

``` bash
mill cod25.runMain cod25.lab0.GenerateLab0
```

To run simulation (needs Verilator installed):

``` bash
mill cod25.runMain cod25.lab0.TestLab0
```

## Notes on Verilator & Simulation

I suggest using Verilator 4.228 for simulation, since Verilator 5 and later has some bugs related to memory working with current SpinalHDL version in this repository. If you see JVM OutOfMemory error, segmentation fault, etc during simulation, downgrading to Verilator 4.228 may help.

Follow the instruction [here](https://verilator.org/guide/latest/install.html#git-quick-install) to build a specified release version of Verilator.
