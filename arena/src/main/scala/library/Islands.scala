package library

import eu.ace_design.island.dsl.DiSLand
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.processes.AssignPitch
import eu.ace_design.island.stdlib.WhittakerDiagrams

object Islands extends DiSLand {

  val s03 = 0x161D552A4A22E2A1L
  lazy val week03: IslandMap = {
    createIsland shapedAs ellipsis(75.percent, 33.percent, 291) withSize 1600 having 2000.faces builtWith Seq(
      plateau(30), flowing(rivers = 5, distance = 0.4), withMoisture(soils.wet, distance = 300),
      AssignPitch, usingBiomes(WhittakerDiagrams.caribbean)) usingSeed s03
  }


  val s04 = 0x5B75D6CC8B576BD4L
  lazy val week04: IslandMap = {
    createIsland shapedAs donut(50.percent, 10.percent) withSize 1600 having 2000.faces builtWith Seq(
      plateau(10), flowing(rivers = 10, distance = 0.5), withMoisture(soils.dry, distance = 100),
      AssignPitch, usingBiomes(WhittakerDiagrams.nordic)) usingSeed s04
  }

}
