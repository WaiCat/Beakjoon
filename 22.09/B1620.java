import java.io.*;
import java.util.*;

public class B1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> strmap = new HashMap<>();
        HashMap<Integer, String> intmap = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {;
            String s = br.readLine();
            intmap.put(i, s);
            strmap.put(s, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (Character.isDigit(s.charAt(0))) {
                sb.append(intmap.get(Integer.parseInt(s)) + "\n");
            } else {
                sb.append(strmap.get(s) + "\n");
            }
        }
        System.out.println(sb);
    }
}