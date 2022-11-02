import java.io.*;

public class B9663 {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        Queen(arr, n, 0);
        System.out.println(count);
    }

    static void Queen(int[][] arr, int n, int l) {
        for (int i = 0; i < n; i++) {
            if (arr[l][i] != 0) {
                continue;
            }
            if (l == n - 1) {
                count++;
                return;
            }
            bool(arr, n, l, i, 1);
            Queen(arr, n, l + 1);
            bool(arr, n, l, i, -1);
        }
    }

    static void bool(int[][] arr, int n, int l, int i, int b) {
        arr[l][i] += b;
        for (int j = 1; j < n - l; j++) {
            arr[l + j][i] += b;
            if (i - j >= 0) {
                arr[l + j][i - j] += b;
            }
            if (i + j < n) {
                arr[l + j][i + j] += b;
            }
        }
    }
}