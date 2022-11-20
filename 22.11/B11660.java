import java.io.*;
import java.util.*;

public class B11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i][j - 1] + Integer.parseInt(st.nextToken());

            }
        }

        for (int i = 0; i < m; i++) {
            int sum = 0;

            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) - 1;
            int y1 = Integer.parseInt(st.nextToken()) - 1;
            int x2 = Integer.parseInt(st.nextToken()) - 1;
            int y2 = Integer.parseInt(st.nextToken()) - 1;

            for (int j = x1; j <= x2; j++) {
                if (y1 == 0) {
                    sum += arr[j][y2];
                } else {
                    sum += arr[j][y2] - arr[j][y1 - 1];
                }
            }
            System.out.println(sum);
        }
    }
}