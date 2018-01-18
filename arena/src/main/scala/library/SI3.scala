package library

import eu.ace_design.island.arena.Teams
import eu.ace_design.island.bot.IExplorerRaid

trait SI3 extends Teams {

  val refs:  Map[String, Class[_ <: IExplorerRaid]] = Map(
    "champion" -> classOf[fr.unice.polytech.si3.qgl.iaad.Explorer],
    "mvp"      -> classOf[fr.unice.polytech.si3.qgl.isx.Explorer]
  )

  val teams:  Map[String, Class[_ <: IExplorerRaid]] = Map(

  )

  def all:  Map[String, Class[_ <: IExplorerRaid]] = teams ++ refs

}
