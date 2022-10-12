import java.io.*;
import java.util.*;

public class B1018 {

    public static int bcount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[][] str = new String[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                str[i] = s.split("");
            }
        }
        int min = 64;

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int w = white(str, i, j);
                int k = w < bcount ? w : bcount;
                min = min < k ? min : k;
            }
        }
        System.out.println(min);
    }

    public static int white(String[][] str, int n, int m) {
        int count = 0;
        bcount = 0;
        for (int i = n; i < n + 8; i++) {
            for (int j = m; j < m + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (str[i][j].equals("B")) {
                        count++;
                    } else {
                        bcount++;
                    }
                } else {
                    if (str[i][j].equals("W")) {
                        count++;
                    } else {
                        bcount++;
                    }
                }
            }
        }
        return count;
    }
}