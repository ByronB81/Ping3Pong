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

  @Test
  public void runPing3Pong_countUpToNumber_ArrayList(){
    Ping3Pong testPing3Pong = new Ping3Pong();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    expectedOutput.add(2);
    assertEquals(expectedOutput, testPing3Pong.runPing3Pong(2));
  }

  @Test
  public void runPing3Pong_replaceMultipleOf3_ArrayList() {
    Ping3Pong testPing3Pong = new Ping3Pong();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    expectedOutput.add(2);
    expectedOutput.add("ping");
    assertEquals(expectedOutput, testPing3Pong.runPing3Pong(3));
  }

  @Test
  public void runPing3Pong_replaceMultipleOf5_ArrayList() {
    Ping3Pong testPing3Pong = new Ping3Pong();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(1);
    expectedOutput.add(2);
    expectedOutput.add("ping");
    expectedOutput.add(4);
    expectedOutput.add("pong");
    assertEquals(expectedOutput, testPing3Pong.runPing3Pong(5));
  }

}
