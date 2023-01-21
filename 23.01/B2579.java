import java.io.*;

public class B2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if (n > 0) {
            dp[0] = arr[0];
        }
        if (n > 1) {
            dp[1] = arr[0] + arr[1];
        }
        if (n > 2) {
            dp[2] = Math.max(arr[1], arr[0]) + arr[2];
        }

        for (int i = 3; i < n; i++) {
            int a = arr[i - 1] + dp[i - 3];
            int b = dp[i - 2];
            dp[i] = Math.max(a, b) + arr[i];
        }

        System.out.println(dp[n - 1]);
    }
}
