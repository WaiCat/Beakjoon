import java.io.*;
import java.util.*;

public class B15649 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];

        su(n, m, arr, 0);
        System.out.println(sb);

    }

    public static void su(int n, int m, int[] arr, int k) {
        for (int i = 1; i <= n; i++) {
            Boolean s = true;
            for (int j = 0; j < k; j++) {
                if (i == arr[j]) {
                    s = false;
                    break;
                }
            }
            if (s) {
                arr[k] = i;
            } else {
                continue;
            }
            if (m - 1 != k) {
                su(n, m, arr, k + 1);
            } else {
                for (int j = 0; j <= k; j++) {
                    sb.append(arr[j] + " ");
                }
                sb.append("\n");
            }
        }
        return;
    }
}