import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class Ping3PongTest {

  @Test
  public void runPing3Pong_countUpToOne_ArrayList() {

    Ping3Pong testPing3Pong = new Ping3Pong();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    assertEquals(expectedOutput, testPing3Pong.runPing3Pong(1));

  }
}
