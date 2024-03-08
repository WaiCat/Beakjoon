import java.io.*;
import java.util.*;

public class B24511 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());

    Deque<Integer> d = new LinkedList<>();

    int m = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      int value = Integer.parseInt(st.nextToken());
      if (value == 0 && m > 0) {
        m--;
        d.addFirst(Integer.parseInt(st2.nextToken()));
      } else {
        st2.nextToken();
      }
    }

    st = new StringTokenizer(br.readLine());

    while (!d.isEmpty()) {
      bw.write(d.pop() + " ");
    }

    for (int i = 0; i < m; i++) {
      bw.write(Integer.parseInt(st.nextToken()) + " ");
    }

    bw.flush();
  }
}
