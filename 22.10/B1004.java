import java.util.*;
import java.io.*;

public class B1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < t; i++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                int s = 0;
                st = new StringTokenizer(br.readLine());
                int x3 = Integer.parseInt(st.nextToken());
                int y3 = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                if ((int) (Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)) < r * r) {
                    count++;
                    s++;
                }
                if ((int) (Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)) < r * r) {
                    count++;
                    s++;
                }
                if (s == 2) {
                    count -= 2;
                }

            }
            System.out.println(count);
        }
    }
}