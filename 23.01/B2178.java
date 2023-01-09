import java.io.*;
import java.util.*;

public class B2178 {

    static int log = Integer.MAX_VALUE;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
        dfs(0, 0, 1, arr);

        System.out.println(log);

    }

    public static void dfs(int a, int b, int count, int[][] r) {
        int c = 0;
        int[][] k = r;
        k[a][b]=0;
        if (a == n-1 && b == m-1) {
            log = log < count ? log : count;
        } else {
            if (a < n) {//아래
                if (k[a + 1][b] == 1) {
                    dfs(a + 1, b, count + 1, k);
                    c++;
                }
            }
            if (a > 0) {//위
                if (k[a - 1][b] == 1) {
                    dfs(a - 1, b, count + 1, k);
                    c++;
                }
            }
            if (b < m) {//오른
                if (k[a][b + 1] == 1) {
                    dfs(a, b + 1, count + 1, k);
                    c++;
                }
            }
            if (b > 0) {//왼
                if (k[a][b - 1] == 1) {
                    dfs(a, b - 1, count + 1, k);
                    c++;
                }
            }
        }
    }
}