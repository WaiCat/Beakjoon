import java.io.*;
import java.util.*;

public class B1697_dp {

    static int[] dp;
    static int k;

    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      k = Integer.parseInt(st.nextToken());

      if (n < k) {
        dp = new int[(k * 2) + 1];

        initializeValues(n);
        calculateMinimumMoves(n + 1);
        System.out.println(dp[k] - 1);
    } else {
      System.out.println(n - k);
      }
    }
    
    public static void initializeValues(int n) {
      int num = 1;
      for (int i = n; i >= (n/2); i--) {
        dp[i] = num++;
      }
    }

    public static void calculateMinimumMoves(int n) {
      for (; n <= k; n++) {
        if (n % 2 == 0) {
          dp[n] = Math.min(dp[n / 2], dp[n - 1]) + 1;
        } else {
          dp[n] = Math.min(dp[n - 1] + 1, dp[(n + 1) / 2] + 2);
        }
      } 
    }
}
