import java.io.*;
import java.util.*;

public class B11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Vector<Integer> v = new Vector<>();

        for (int i = 1; i <= n; i++) {
            v.add(i);
        }

        m -= 1;
        int k = m;
        sb.append("<" + v.get(k));
        v.remove(v.get(k));

        for (int i = 1; i < n; i++) {
            k = (k + m) % v.size();

            sb.append(", " + v.get(k));
            v.remove(v.get(k));
        }

        sb.append(">");
        System.out.println(sb);
    }
}