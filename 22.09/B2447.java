import java.util.*;

public class B2447 {

    static char[][] arr;

    public static void star(int n, int x, int y, boolean blank) {

        if (blank) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }
        int k = n / 3;
        int mid = 0;
        for (int i = x; i < x + n; i += k) {
            for (int j = y; j < y + n; j += k) {
                mid++;
                if (mid == 5) {
                    star(k, i, j, true);
                } else {
                    star(k, i, j, false);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new char[n][n];
        star(n, 0, 0, false);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
        sc.close();
    }
}