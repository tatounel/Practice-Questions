import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
public class DecodeTests {
  @Test
  public void shouldWorkForIndividualCharacters() {
    assertEquals((Integer)1, Challenge.decode("I"));
  }
  @Test
  public void shouldHandleDescendingValues() {
    assertEquals((Integer)21, Challenge.decode("XXI"));
  }
  @Test
  public void shouldHandleAscendingValues() {
    assertEquals((Integer)4, Challenge.decode("IV"));
  }
}
