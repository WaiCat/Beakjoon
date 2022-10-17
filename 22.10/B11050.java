import java.io.*;
import java.util.*;

public class B11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if (k <= n) {
            System.out.println(fac(n) / (fac(k) * fac(Math.abs(n - k))));
        } else {
            System.out.println(0);
        }
    }

    public static int fac(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return fac(n - 1) * n;
    }
}