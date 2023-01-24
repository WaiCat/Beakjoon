import java.io.*;

public class B1003 {

    static int zero;
    static int one;
    static int[][] dp;
    static int f;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        dp = new int[41][2];


        for (int i = 0; i < n; i++) {
            zero = 0;
            one = 0;

            f = Integer.parseInt(br.readLine());

            if (dp[f][0] == 0) {
                fibo(f);
                dp[f][0] = zero;
                dp[f][1] = one;
            }

            sb.append(dp[f][0]).append(" ").append(dp[f][1]).append("\n");
        }

        System.out.println(sb);

    }

    public static void fibo(int n) {

        if (n == 0) {
            zero++;
        } else if (n == 1) {
            one++;
        } else {
            if (dp[n - 1][0] == 0) {
                fibo(n - 1);
            } else {
                zero = dp[n - 1][0];
                one = dp[n - 1][1];
            }
            if (dp[n - 2][0] == 0) {
                fibo(n - 2);
            } else {
                zero += dp[n - 2][0];
                one += dp[n - 2][1];
            }

            dp[n][0] = zero;
            dp[n][1] = one;
        }
    }
}
