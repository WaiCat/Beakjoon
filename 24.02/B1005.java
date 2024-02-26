import java.io.*;
import java.util.*;

public class B1005 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for (int test = 0; test < t; test++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

      int[] time = new int[n + 1];
      ArrayList<Integer>[] list = new ArrayList[n + 1];
      int[] degree = new int[n + 1];
      int[] dp = new int[n + 1];

      Queue<Integer> queue = new ArrayDeque<>();

      st = new StringTokenizer(br.readLine());
      for (int i = 1; i <= n; i++) {
        time[i] = Integer.parseInt(st.nextToken());
        list[i] = new ArrayList<Integer>();
      }

      for (int i = 0; i < k; i++) {
        st = new StringTokenizer(br.readLine());
        int dependent = Integer.parseInt(st.nextToken());
        int prerequisite = Integer.parseInt(st.nextToken());

        list[dependent].add(prerequisite);
        degree[prerequisite]++;
      }

      for (int i = 1; i <= n; i++) {
        dp[i] = time[i];
        if (degree[i] == 0) {
          queue.offer(i);
        }
      }

      while (!queue.isEmpty()) {
        int index = queue.poll();
        for (int i : list[index]) {
          degree[i]--;
          dp[i] = Math.max(dp[i], dp[index] + time[i]);
          if (degree[i] == 0) {
            queue.offer(i);
          }
        }
      }

      int w = Integer.parseInt(br.readLine());

      System.out.println(dp[w]);
      System.out.println();
    }
  }
}