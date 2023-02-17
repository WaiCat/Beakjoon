import java.io.*;
import java.util.*;

public class B2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = Integer.MIN_VALUE;

        if (n > 0) {
            dp[0] = arr[0];
        }
        if (n > 1) {
            dp[1] = arr[0] + arr[1];
            max=dp[1];
        }
        if (n > 2) {
            dp[2] = Math.max(arr[0], arr[1]) + arr[2];
            max = Math.max(dp[2], dp[1]);
            dp[2] = max;
        }

        for (int i = 3; i < n; i++) {
            int a = dp[i - 2];
            int b = dp[i - 3] + arr[i - 1];

            max = Math.max(max, Math.max(a, b) + arr[i]);
            dp[i] = max;
        }
        Arrays.sort(dp);
        System.out.println(dp[n - 1]);
    }
}
