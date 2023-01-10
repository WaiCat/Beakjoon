import java.io.*;
import java.util.*;

public class B1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Integer.parseInt(st.nextToken());
            long b = Integer.parseInt(st.nextToken());
            long sum = 1;

            for (int j = 0; j < a; j++) {
                sum *= b - j;
                sum /= 1 + j;
            }

            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}