import java.io.*;
import java.util.*;

public class B15650 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m + 1];
        su(n, m, arr, 1);
        System.out.println(sb);

    }

    public static void su(int n, int m, int[] arr, int k) {
        for (int i = arr[k - 1] + 1; i <= n; i++) {
            arr[k] = i;
            if (m != k) {
                su(n, m, arr, k + 1);
            } else {
                for (int j = 1; j <= k; j++) {
                    sb.append(arr[j] + " ");
                }
                sb.append("\n");
            }
        }
        return;
    }
}