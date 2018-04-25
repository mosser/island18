package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week17 extends Run with SI3 {

  override val number: String = "17"

  override val seed: Long                = Islands.s17
  override lazy val theIsland: IslandMap = Islands.week17

  override val crew: Int    = 21
  override val budget: Int  = 30000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 15000), (GLASS, 20), (FUR, 500), (RUM, 30))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] =  refs // all - "isb"

}
