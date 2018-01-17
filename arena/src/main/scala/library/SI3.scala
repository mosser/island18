package library

import eu.ace_design.island.arena.Teams
import eu.ace_design.island.bot.IExplorerRaid

trait SI3 extends Teams {

  val teams:  Map[String, Class[_ <: IExplorerRaid]] = Map(
    "isx" -> classOf[fr.unice.polytech.si3.qgl.isx.Explorer]
  )

  def players:  Map[String, Class[_ <: IExplorerRaid]] = teams

}
