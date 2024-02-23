import java.io.*;
import java.util.*;

public class B2745 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String n = st.nextToken();
    int b = Integer.parseInt(st.nextToken());

    int sum = 0;
    int j = 1;

    for (int i = n.length() - 1; i >= 0; i--) {
      char tmp = n.charAt(i);
      int k = 1;
      if (Character.isDigit(tmp)) {
        k = Character.getNumericValue(tmp);
      } else {
        k = (tmp - 55);
      }
      sum += k * j;
      j *= b;
    }

    System.out.println(sum);
  }
}
