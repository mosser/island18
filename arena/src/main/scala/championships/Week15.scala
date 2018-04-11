package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week15 extends Run with SI3 {

  override val number: String = "15"

  override val seed: Long                = Islands.s15
  override lazy val theIsland: IslandMap = Islands.week15

  override val crew: Int    = 4
  override val budget: Int  = 10000
  override val plane: Plane = Plane(1, 1, Directions.EAST)
  override val objectives: Set[(Resource, Int)] = Set((WOOD, 500), (GLASS, 15), (FUR, 500), (SUGAR_CANE, 400))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] =  all - "ism"

}
