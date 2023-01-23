import java.io.*;
import java.util.*;

public class B11053 {

    static int count = 1;
    static int[] arr;
    static boolean[] visited;
    static int n;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n + 1];
        visited = new boolean[n + 1];
        dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;

            for (int j = i + 1; j < n; j++) {
                if (visited[j]) {
                    continue;
                }
                if (arr[i] < arr[j]) {
                    visited[j] = true;
                    count = Math.max(nextnum(j) + 1, count);
                }
            }
        }

        System.out.println(count);
    }

    public static int nextnum(int index) {
        int max = 1;
        for (int i = index + 1; i < n; i++) {
            int c = 1;
            if (arr[index] < arr[i]) {
                if (dp[i] == 0) {
                    c += nextnum(i);
                } else {
                    c += dp[i];
                }
                max = Math.max(max, c);
            }
        }
        dp[index] = max;
        return max;
    }
}
