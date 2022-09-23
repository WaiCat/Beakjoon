import java.io.*;
import java.util.*;

public class B1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int de = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            map.put(k, k);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (map.get(k) == null) {
                de++;
            } else {
                sum++;
            }
        }
        System.out.println(n - sum + de);
    }
}