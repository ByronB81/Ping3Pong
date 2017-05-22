import java.io.Console;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Enter a number");
    String stringUserNumber = console.readLine();
    int intUserNumber = Integer.parseInt(stringUserNumber);
    Ping3Pong pingPong = new Ping3Pong();
    List<Object> pingPongResult = pingPong.runPing3Pong(intUserNumber);
    System.out.println(pingPongResult);

  }
}
