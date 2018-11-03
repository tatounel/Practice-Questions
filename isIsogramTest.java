import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
public class IsIsogramTests {
  @Test
  public void shouldHandleIsograms() {
    assertEquals(true, Challenge.isIsogram("Dermatoglyphics"));
    assertEquals(true, Challenge.isIsogram("Dermatoglyphics"));
  }
  @Test
  public void shouldHandleNonIsograms() {
    assertEquals(false, Challenge.isIsogram("moose"));
    assertEquals(false, Challenge.isIsogram("aba"));
  }
  @Test
  public void shouldHandleEdgeCases() {
    assertEquals(false, Challenge.isIsogram("moOse"));
    assertEquals(true, Challenge.isIsogram(""));
    assertEquals(true, Challenge.isIsogram("αβγδεζηθικλμνξοπρστυφχψω"));
    assertEquals(false, Challenge.isIsogram("αβγδεζηθικλμνξοπρστυφχψωα"));
  }
}
