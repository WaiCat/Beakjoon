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
    } else {
      st = new StringTokenizer(br.readLine());
      int a = Math.abs(s - Integer.parseInt(st.nextToken()));
      while (st.hasMoreTokens()) {
        int b = Math.abs(s - Integer.parseInt(st.nextToken()));
        a = gcd(a, b);
      }
      System.out.println(a);
    }
  }

  public static int gcd(int a, int b) {
    if (a > b) {
      while (b != 0) {
        int tmp = a % b;
        a = b;
        b = tmp;
      }
      return a;
    } else {
      while (a != 0) {
        int tmp = b % a;
        b = a;
        a = tmp;
      }
      return b;
    }
  }
}