import java.io.*;
import java.util.*;

public class B1012 {

    static int[][] arr;
    static int a;
    static int b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int home = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            arr = new int[a][b];

            for (int k = 0; k < t; k++) {
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                arr[l][c] = 1;
            }

            for (int k = 0; k < a; k++) {
                for (int j = 0; j < b; j++) {
                    if (arr[k][j] == 1) {
                        home++;
                        arr[k][j] = 0;
                        search(k, j);
                    }
                }
            }
            sb.append(home).append("\n");
        }
        System.out.println(sb);
    }

    public static void search(int i, int j) {
        if (j > 0) {
            if (arr[i][j - 1] == 1) {
                arr[i][j - 1] = 0;
                search(i, j - 1);
            }
        }
        if (j < b - 1) {
            if (arr[i][j + 1] == 1) {
                arr[i][j + 1] = 0;
                search(i, j + 1);
            }
        }
        if (i > 0) {
            if (arr[i - 1][j] == 1) {
                arr[i - 1][j] = 0;
                search(i - 1, j);
            }
        }
        if (i < a - 1) {
            if (arr[i + 1][j] == 1) {
                arr[i + 1][j] = 0;
                search(i + 1, j);
            }
        }
    }
}
