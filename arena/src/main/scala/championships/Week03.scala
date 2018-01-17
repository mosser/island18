package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week03 extends Run with SI3 {

  override val number: String = "03"

  override val seed: Long                = Islands.s03
  override lazy val theIsland: IslandMap = Islands.week03

  override val crew: Int    = 15
  override val budget: Int  = 30000
  override val plane: Plane = Plane(159, 159, Directions.NORTH)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 2000), (FUR, 100), (QUARTZ, 400), (RUM, 2))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] = teams

}
