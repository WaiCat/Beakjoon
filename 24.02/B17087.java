import java.io.*;
import java.util.*;

public class B17087 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());

    if (n == 1) {
      int bro = Integer.parseInt(br.readLine());
      System.out.println(Math.abs(s - bro));
    }

    int[] bros = new int[n];

  }
}