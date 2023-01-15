import java.io.*;
import java.util.*;

public class B9375 {

    public static int[] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            HashMap<String, Integer> map = new HashMap<>();

            for (int j = 0; j < m; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                str = st.nextToken();
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                } else {
                    map.put(str, 1);
                }
            }

            int sum = 1;
            for (String s : map.keySet()) { //저장된 key값 확인
                sum = sum * (map.get(s) + 1);
            }
            sb.append(sum - 1).append("\n");
        }
        System.out.println(sb);
    }
}
