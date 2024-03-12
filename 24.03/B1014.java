import java.io.*;
import java.util.*;

public class B1014 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int c = Integer.parseInt(br.readLine());

    for (int i = 0; i < c; i++) {
      st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      int[] seat = new int[m];
      char[][] table = new char[n][m];
      boolean[][] ntable = new boolean[m][m];

      for (int j = 0; j < n; j++) {
        String inputLine = br.readLine();
        for (int j2 = 0; j2 < m; j2++) {
          table[j][j2] = inputLine.charAt(j2);
          if (inputLine.charAt(j2) == '.') {
            seat[j2]++;
          }
        }
      }

      int[] dp = new int[m];
      dp[0] = seat[0];
      ntable[0][0] = true;

      if (m > 0) {
        dp[1] = seat[1];
        ntable[1][1] = true;
      }
      if (m > 1) {
        if (seat[2] + dp[0] > dp[1]) {
          dp[2] = seat[2] + dp[0];
          ntable[2] = ntable[0];
          ntable[2][2] = true;
        } else {
          dp[2] = dp[1];
          ntable[2] = ntable[1];
        }
      }

      for (int j = 3; j < m; j++) {
        dp[j] = seat[j] + Math.max(dp[j - 3], dp[j - 2]);
        if (dp[j - 3] > dp[j - 2]) {
          dp[j] = dp[j - 3];
          ntable[j] = ntable[j - 3];
        } else {
          dp[j] = dp[j - 2];
          ntable[j] = ntable[j - 2];
        }
        dp[j] += seat[j];
        ntable[j][j] = true;
        dp[j] = Math.max(dp[j], dp[j - 1]);
        if (dp[j] < dp[j - 1]) {
          dp[j] = dp[j - 1];
          ntable[j] = ntable[j - 1];
        }
      }

      for (int j = 0; j < m; j++) {
        if (!ntable[m - 1][j]) {
          for (int j2 = 0; j2 < n; j2++) {
            if (table[j2][j] == '.' && checkAllSurroundingsX(table, j2, j)) {
              dp[m - 1]++;
            }
          }
        }
      }

      System.out.println(dp[m - 1]);
    }
  }

  private static boolean checkAllSurroundingsX(char[][] array, int row, int col) {
    // 주위의 인덱스
    int[] rows = { -1, -1, 0, 0, 1, 1 };
    int[] cols = { -1, 1, -1, 1, -1, 1 };

    for (int i = 0; i < rows.length; i++) {
      int newRow = row + rows[i];
      int newCol = col + cols[i];

      // 주위의 인덱스가 배열 범위 내에 있는지 확인
      if (newRow >= 0 && newRow < array.length && newCol >= 0 && newCol < array[newRow].length) {
        if (array[newRow][newCol] != 'x') {
          return false;
        }
      }
    }

    return true;
  }
}