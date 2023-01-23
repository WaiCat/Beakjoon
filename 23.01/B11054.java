import java.io.*;
import java.util.*;

public class B11054 {

    static int[] arr;
    static boolean[] visited;
    static int n;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];
        visited = new boolean[n];
        dp = new int[n][3];
        dp[0][0] = 1;
        dp[n - 1][1] = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n - 1; i > 0; i--) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;

            for (int j = i - 1; j >= 0; j--) {
                if (visited[j]) {
                    dp[i][0] = Math.max(dp[j][0] + 1, dp[i][0]);
                    continue;
                }
                if (arr[i] > arr[j]) {
                    visited[j] = true;
                    dp[i][0] = Math.max(nextnum(j) + 1, dp[i][0]);
                }
            }
            if (dp[i][0] == 0) {
                dp[i][0] = 1;
            }
        }


        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;

            for (int j = i + 1; j < n; j++) {
                if (visited[j]) {
                    dp[i][1] = Math.max(dp[j][1] + 1, dp[i][1]);
                    continue;
                }
                if (arr[i] > arr[j]) {
                    visited[j] = true;
                    dp[i][1] = Math.max(prevnum(j) + 1, dp[i][1]);
                }
            }
            if (dp[i][1] == 0) {
                dp[i][1] = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            dp[i][2] = dp[i][0] + dp[i][1];
            max = Math.max(max, dp[i][2]);
        }

        System.out.println(max - 1);
    }

    public static int nextnum(int index) {

        int max = 1;
        for (int i = index - 1; i >= 0; i--) {
            int c = 1;
            if (arr[index] > arr[i]) {
                if (dp[i][0] == 0) {
                    c += nextnum(i);
                } else {
                    c += dp[i][0];
                }
                max = Math.max(max, c);
            }
        }
        dp[index][0] = max;
        return max;
    }

    public static int prevnum(int index) {
        int max = 1;
        for (int i = index + 1; i < n; i++) {
            int c = 1;
            if (arr[index] > arr[i]) {
                if (dp[i][1] == 0) {
                    c += prevnum(i);
                } else {
                    c += dp[i][1];
                }
                max = Math.max(max, c);
            }
        }
        dp[index][1] = max;
        return max;
    }

}
