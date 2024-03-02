import java.io.*;
import java.util.*;

public class B1011 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());

      int num = y - x;

      long border = (int) Math.sqrt(num);

      if (num <= border * (border + 1)) {
        if (num <= border * border) {
          System.out.println(border * 2 - 1);
        } else {
          System.out.println(border * 2);
        }
      } else {
        border++;
        if (num <= border * border) {
          System.out.println(border * 2 - 1);
        } else {
          System.out.println(border * 2);
        }
      }
    }
  }
}
