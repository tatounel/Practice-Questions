import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
public class MaskifyTests {
  @Test
  public void shouldWorkForVariousInputs() {
    assertEquals("############0694", Challenge.maskify("5512103073210694"));
    assertEquals("#4321", Challenge.maskify("54321"));
    assertEquals("21", Challenge.maskify("21"));
    assertEquals("####################################man!", Challenge.maskify("Nananananananananananananananana Batman!"));
    assertEquals("", Challenge.maskify(""));
  }
}
