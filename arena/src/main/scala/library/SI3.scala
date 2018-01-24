package library

import eu.ace_design.island.arena.Teams
import eu.ace_design.island.bot.IExplorerRaid

trait SI3 extends Teams {

  val refs:  Map[String, Class[_ <: IExplorerRaid]] = Map(
    "champion" -> classOf[fr.unice.polytech.si3.qgl.iaad.Explorer],
    "mvp"      -> classOf[fr.unice.polytech.si3.qgl.isx.Explorer]
  )

  val teams:  Map[String, Class[_ <: IExplorerRaid]] = Map(
    //"isa" ->  classOf[fr.unice.polytech.si3.qgl.isa.Explorer],
    //"isb" ->  classOf[fr.unice.polytech.si3.qgl.isb.Explorer],
    //"isc" ->  classOf[fr.unice.polytech.si3.qgl.isc.Explorer],
    //"isd" ->  classOf[fr.unice.polytech.si3.qgl.isd.Explorer],
    //"ise" ->  classOf[fr.unice.polytech.si3.qgl.ise.Explorer],
    //"isf" ->  classOf[fr.unice.polytech.si3.qgl.isf.Explorer],
    //"isg" ->  classOf[fr.unice.polytech.si3.qgl.isg.Explorer],
    //"ish" ->  classOf[fr.unice.polytech.si3.qgl.ish.Explorer],
    //"isi" ->  classOf[fr.unice.polytech.si3.qgl.isi.Explorer],
    //"isj" ->  classOf[fr.unice.polytech.si3.qgl.isj.Explorer],
    //"isk" ->  classOf[fr.unice.polytech.si3.qgl.isk.Explorer],
    //"isl" ->  classOf[fr.unice.polytech.si3.qgl.isl.Explorer],
    //"ism" ->  classOf[fr.unice.polytech.si3.qgl.ism.Explorer],
    //"isn" ->  classOf[fr.unice.polytech.si3.qgl.isn.Explorer],
    //"iso" ->  classOf[fr.unice.polytech.si3.qgl.iso.Explorer],
    //"isp" ->  classOf[fr.unice.polytech.si3.qgl.isp.Explorer]
  )

  def all:  Map[String, Class[_ <: IExplorerRaid]] = refs ++ teams

}
