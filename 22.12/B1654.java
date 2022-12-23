import java.io.*;
import java.util.*;

public class B1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        long max = Integer.MIN_VALUE + 1;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = arr[i] > max ? arr[i] : max;
        }
        max++;
        long min = 1;
        long l = max/2;
        while (true) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i] / l;
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