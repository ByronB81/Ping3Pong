import java.util.ArrayList;
import java.util.List;

public class Ping3Pong{

  public List<Object> runPing3Pong(int countUpTo) {
    List<Object> result = new ArrayList<Object>();
    for (int i = 1; i <= countUpTo; i++){
      result.add(i);
    }
    return result;
  }

}
