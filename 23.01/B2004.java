import java.io.*;
import java.util.*;

public class B2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

        long count5 = countfive(n) - countfive(n - m) - countfive(m);
        long count2 = counttwo(n) - counttwo(n - m) - counttwo(m);

        System.out.println(Math.min(count5, count2));

    }

    public static long countfive(long num) {
        long count = 0;

        while(num >= 5) {
            count += num/5;
            num /= 5;
        }

        return count;
    }

    public static long counttwo(long num) {
        int count = 0;

        while(num >= 2) {
            count += num/2;
            num /= 2;
        }
        return count;
    }
}
