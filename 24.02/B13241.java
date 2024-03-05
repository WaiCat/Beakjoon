import java.io.*;
import java.util.*;

public class B13241 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    long a = Integer.parseInt(st.nextToken());
    long b = Integer.parseInt(st.nextToken());

    System.out.println(lcm(a, b));
  }

  public static long gcd(long a, long b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  public static long lcm(long a, long b) {
    return (a * b) / gcd(a, b);
  }
}
