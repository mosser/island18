package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week06 extends Run with SI3 {

  override val number: String = "06"

  override val seed: Long                = Islands.s06
  override lazy val theIsland: IslandMap = Islands.week06

  override val crew: Int    = 14
  override val budget: Int  = 25000
  override val plane: Plane = Plane(159, 159, Directions.WEST)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 1000), (FRUITS, 40), (QUARTZ, 100), (FLOWER, 500))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] = refs

}
