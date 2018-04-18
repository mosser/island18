package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week16 extends Run with SI3 {

  override val number: String = "16"

  override val seed: Long                = Islands.s16
  override lazy val theIsland: IslandMap = Islands.week16

  override val crew: Int    = 12
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 5000), (GLASS, 10), (FUR, 15), (FLOWER, 10))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] =  all - "isb"

}
