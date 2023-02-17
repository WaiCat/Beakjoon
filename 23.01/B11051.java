import java.io.*;
import java.util.*;

public class B11051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][n + 1];


        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j]) % 10007;
                }
            }
        }
        System.out.println(arr[n][m]);
    }
}
