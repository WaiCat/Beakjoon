import java.io.*;
import java.util.*;

public class B1358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int r = h / 2;
        int count = 0;

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            if ((int) (Math.pow(x - x1, 2) + Math.pow(y + r - y1, 2)) <= r * r) {
                count++;
            } else if ((int) (Math.pow(x + w - x1, 2) + Math.pow(y + r - y1, 2)) <= r * r) {
                count++;
            } else if (x <= x1 && x1 <= x + w && y <= y1 && y1 <= y + h) {
                count++;
            }
        }
        System.out.println(count);
    }
}