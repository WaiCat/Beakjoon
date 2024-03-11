import java.io.*;
import java.util.*;

public class B1014 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int c = Integer.parseInt(br.readLine());

    for (int i = 0; i < c; i++) {
      st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      int[] seat = new int[m];

      for (int j = 0; j < n; j++) {
        String inputLine = br.readLine();

        for (int j2 = 0; j2 < m; j2++) {
          if (inputLine.charAt(j2) == '.') {
            seat[j2]++;
          }
        }

        System.out.println(inputLine);
      }

    }

  }
}
