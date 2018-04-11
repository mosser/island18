package retrospectives
import championships._
import eu.ace_design.island.arena.{Retrospective, Run}
import library.SI3

object RetroWeek15 extends Retrospective with SI3 {

  override val outputDir = "championships/_retro_week_15"

  val sandbox: Set[Run] = Set(Week03, Week04, Week05, Week06, Week07, Week08, Week09)
  val preprod: Set[Run] = Set(Week10, Week11, Week12, Week13, Week14, Week15)

  override val weeks: Set[Run] = sandbox ++ preprod

  override def players =  all - "ism"

  trigger

}