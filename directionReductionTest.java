import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class DirReductionTest {
  @Test
  public void testSimpleDirReduc() throws Exception {
    assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
        new String[]{"WEST"},
        DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

    assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
        new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
        DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
  }
}
