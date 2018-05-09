package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week19 extends Run with SI3 {

  override val number: String = "19"

  override val seed: Long                = Islands.s19
  override lazy val theIsland: IslandMap = Islands.week19

  override val crew: Int    = 7
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives: Set[(Resource, Int)] =
    Set((WOOD, 3000), (ORE, 20), (FUR, 500), (RUM, 40), (SUGAR_CANE, 300), (FLOWER, 12))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] =  all - "isj"

}
