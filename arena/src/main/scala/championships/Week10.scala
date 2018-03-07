package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week10 extends Run with SI3 {

  override val number: String = "10"

  override val seed: Long                = Islands.s10
  override lazy val theIsland: IslandMap = Islands.week10

  override val crew: Int    = 7
  override val budget: Int  = 15000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 5000), (LEATHER, 50), (QUARTZ, 20))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] =  refs // all - "isp"

}
