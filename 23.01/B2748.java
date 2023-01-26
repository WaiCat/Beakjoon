import java.io.*;

public class B2748 {

    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        System.out.println(fibo(n));
    }

    public static long fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            if (dp[n - 2] == 0) {
                dp[n - 2] = fibo(n - 2);
            }
            if (dp[n - 1] == 0) {
                dp[n - 1] = fibo(n - 1);
            }
        }
        dp[n] = dp[n - 2] + dp[n - 1];
        return dp[n];
    }
}
