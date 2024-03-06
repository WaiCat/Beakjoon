import java.io.*;
import java.util.*;

public class B24511 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      int value = Integer.parseInt(st.nextToken());
      if (value == 0 && m > 0) {
        m--;
        sb.append(Integer.parseInt(st2.nextToken()) + " ");
      } else {
        st2.nextToken();
      }
    }

    st = new StringTokenizer(br.readLine());

    if (sb.isEmpty()) {
      while (st.hasMoreTokens()) {
        sb.append(Integer.parseInt(st.nextToken()) + " ");
      }
    } else {
      if (sb.length() > 0) {
        sb.deleteCharAt(sb.length() - 1);
      }
      sb.reverse();
      sb.append(" ");
      for (int i = 0; i < m; i++) {
        sb.append(Integer.parseInt(st.nextToken()) + " ");
      }
    }

    System.out.println(sb);
  }
}
