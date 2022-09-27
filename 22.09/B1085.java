import java.io.*;
import java.util.*;

public class B1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        w -= x;
        if (w > x) {
            w = x;
        }

        h -= y;
        if (h > y) {
            h = y;
        }
        
        if (w <= h) {
            System.out.println(w);
        } else {
            System.out.println(h);
        }
    }
}