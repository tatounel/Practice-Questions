import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
public class ValidPinTests {
  @Test
  public void shouldAcceptValidPins() {
    assertEquals(true, Challenge.validPin("1234"));
    assertEquals(true, Challenge.validPin("123456"));
    assertEquals(true, Challenge.validPin("9834"));
    assertEquals(true, Challenge.validPin("012843"));
  }
  @Test
  public void shouldRejectInvalidPins() {
    assertEquals(false, Challenge.validPin(""));
    assertEquals(false, Challenge.validPin("123"));
    assertEquals(false, Challenge.validPin("56789"));
    assertEquals(false, Challenge.validPin("56789918372"));
    assertEquals(false, Challenge.validPin("a123"));
    assertEquals(false, Challenge.validPin("123z"));
    assertEquals(false, Challenge.validPin("123q4"));
  }
}
