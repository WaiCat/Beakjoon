import java.io.*;
import java.util.*;

public class B3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int f = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            int s = Integer.parseInt(st.nextToken());
            int gd = gcd(f, s);

            System.out.println(f / gd + "/" + s / gd);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}