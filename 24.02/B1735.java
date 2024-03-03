import java.io.*;
import java.util.*;

public class B1735 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int aa = Integer.parseInt(st.nextToken());
    int ab = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int ba = Integer.parseInt(st.nextToken());
    int bb = Integer.parseInt(st.nextToken());

    int l = lcm(ab, bb);

    aa = aa * (l / ab);
    ba = ba * (l / bb);

    aa += ba;

    System.out.print(aa + " " + l);

    int g = gcd(aa, l);

    if (g == 1) {
      System.out.print(aa + " " + l);
    } else {
      aa = aa / g;
      l = l / g;
      System.out.print(aa + " " + l);
    }
  }

  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  public static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }
}
