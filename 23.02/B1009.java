import java.io.*;
import java.util.*;

public class B1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(sq(a, b)).append("\n");
        }
        System.out.println(sb);
    }

    public static int sq(int a, int b) {
        int n = 0;
        int d = a;
        for (int i = 1; i < b; i++) {
            a = a * d % 10;
            n++;
            if (a == d) {
                b = (b - 1) % n + n + 1;
            }
        }
        a = a % 10;
        if (a == 0) {
            return 10;
        } else {
            return a;
        }
    }
}
