package championships

import eu.ace_design.island.arena.Run
import eu.ace_design.island.bot.IExplorerRaid
import eu.ace_design.island.game.{Directions, Plane}
import eu.ace_design.island.map.IslandMap
import eu.ace_design.island.map.resources.Resource
import eu.ace_design.island.stdlib.Resources._
import library.{Islands, SI3}

object Week20 extends Run with SI3 {

  override val number: String = "20"

  override val seed: Long                = Islands.s20
  override lazy val theIsland: IslandMap = Islands.week20

  override val crew: Int    = 5
  override val budget: Int  = 20000
  override val plane: Plane = Plane(1, 1, Directions.SOUTH)
  override val objectives   = Set((WOOD, 5000), (LEATHER, 1000), (FUR, 400), (FLOWER, 1), (INGOT, 3))

  override def players:  Map[String, Class[_ <: IExplorerRaid]] =  all

}
