package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week04 extends Run with SI3 {

  override val number: String = "04"

  override val seed: Long                = Islands.s04
  override lazy val theIsland: IslandMap = Islands.week04

  override val crew: Int    = 7
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 4000), (QUARTZ, 100))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] = all

}
