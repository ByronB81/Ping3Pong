import java.util.ArrayList;
import java.util.List;

public class Ping3Pong{

  public List<Object> runPing3Pong(int countUpTo) {
    List<Object> result = new ArrayList<Object>();
    for (int i = 1; i <= countUpTo; i++){
      if (i % 3 == 0){
        result.add("ping");
      } else if (i % 5 == 0){
        result.add("pong");
      } else {
        result.add(i);
      }
    }
    return result;
  }

}
