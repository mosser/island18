package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week08 extends Run with SI3 {

  override val number: String = "08"

  override val seed: Long                = Islands.s08
  override lazy val theIsland: IslandMap = Islands.week08

  override val crew: Int    = 30
  override val budget: Int  = 30000
  override val plane: Plane = Plane(159, 159, Directions.WEST)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 5000), (RUM, 10), (FUR, 200), (QUARTZ, 100))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] = all - "isg" - "isp"

}
