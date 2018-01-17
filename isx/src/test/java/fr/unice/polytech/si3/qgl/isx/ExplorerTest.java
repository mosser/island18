package fr.unice.polytech.si3.qgl.isx;

import eu.ace_design.island.bot.IExplorerRaid;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExplorerTest {

  @Test public void basicExplorer(){
    IExplorerRaid explorer = new Explorer();
    explorer.initialize("{\"contents\": \"dummy\"}");
    String decision = explorer.takeDecision();
    assertNotNull(decision);
    explorer.acknowledgeResults("{\"contents\": \"dummy\"}");
    String report = explorer.deliverFinalReport();
    assertNotNull(report);
  }

}
