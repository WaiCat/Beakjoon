import java.io.*;
import java.util.*;

public class B1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[n];

        sb.append(k);
        visited[k - 1] = true;
        int a = k - 1;

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < k; i++) {
                a = (a + 1) % n;
                if (visited[a]) {
                    i--;
                }
            }
            sb.append(", ").append(a + 1);
            visited[a] = true;

        }

        sb.append(">");
        System.out.println(sb);
    }
}
