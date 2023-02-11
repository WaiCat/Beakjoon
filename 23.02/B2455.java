import java.io.*;
import java.util.*;

public class B2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int sum = 0;
        int max = 0;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            sum -= Integer.parseInt(st.nextToken());
            sum += Integer.parseInt(st.nextToken());
            max = Math.max(sum, max);

        }

        System.out.println(max);
    }
}
