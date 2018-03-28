package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week13 extends Run with SI3 {

  override val number: String = "13"

  override val seed: Long                = Islands.s13
  override lazy val theIsland: IslandMap = Islands.week13

  override val crew: Int    = 7
  override val budget: Int  = 15000
  override val plane: Plane = Plane(159, 159, Directions.NORTH)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 7000), (QUARTZ, 20), (ORE, 4), (RUM, 5), (SUGAR_CANE, 400))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] =  all - "ism" - "isp"

}
