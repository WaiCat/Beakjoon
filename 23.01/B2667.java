import java.io.*;
import java.util.*;

public class B2667 {

    static int[][] arr;
    static boolean[][] visited;
    static int count;
    static int n;
    static int home = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    count = 1;
                    home++;
                    arr[i][j] = 0;
                    search(i, j);
                    list.add(count);

                }
            }
        }
        System.out.println(home);
        Collections.sort(list);
        for (int i = 0; i < home; i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }

    public static void search(int i, int j) {
        if (j > 0) {
            if (arr[i][j - 1] == 1) {
                arr[i][j - 1] = 0;
                count++;
                search(i, j - 1);
            }
        }
        if (j < n - 1) {
            if (arr[i][j + 1] == 1) {
                arr[i][j + 1] = 0;
                count++;
                search(i, j + 1);
            }
        }
        if (i > 0) {
            if (arr[i - 1][j] == 1) {
                arr[i - 1][j] = 0;
                count++;
                search(i - 1, j);
            }
        }
        if (i < n - 1) {
            if (arr[i + 1][j] == 1) {
                arr[i + 1][j] = 0;
                count++;
                search(i + 1, j);
            }
        }
    }
}
