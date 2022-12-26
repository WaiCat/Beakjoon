import java.io.*;
import java.util.*;

public class B2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long[] arr = new long[n];
        long max = Integer.MIN_VALUE + 1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            max = arr[i] > max ? arr[i] : max;
        }
        max++;
        long min = 0;
        long l = max / 2;
        while (true) {
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > l) {
                    sum += arr[i] - l;
                }
            }
            if (sum >= m) {
                min = l;
            } else if (sum < m) {
                max = l;
            }
            l = (min + max) / 2;
            if (l == min || l == max) {
                break;
            }
        }
        System.out.println(l);
    }
}