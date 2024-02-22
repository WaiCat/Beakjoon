import java.io.*;
import java.util.*;

public class B11005 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    Deque<String> d = new ArrayDeque<>();

    while (n != 0) {
      int tmp = n % b;
      if (tmp > 9) {
        tmp += 55;
        d.addFirst(Character.toString(tmp));
      } else {
        d.addFirst(Integer.toString(tmp));
      }
      n = n / b;
    }
    for (String element : d) {
      System.out.print(element);
    }
  }
}
