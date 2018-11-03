import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;
public class SjfTests {
  @Test
  public void shouldHandleTheExample() {
    Integer expected = 6;
    Integer actual = Challenge.sjf(Arrays.asList(3,10,20,1,2),0);
    assertEquals(expected, actual);
  }
}
