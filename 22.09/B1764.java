import java.io.*;
import java.util.*;

public class B1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<String, String>();
        String[] str = new String[m];
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s, s);
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (map.get(s) != null) {
                str[count] = s;
                count++;
            }
        }
        String[] str1 = new String[count];
        System.arraycopy(str, 0, str1, 0, count);
        Arrays.sort(str1);
        sb.append(count).append("\n");
        for (int i = 0; i < str1.length; i++) {
            sb.append(str1[i]).append("\n");
        }
        System.out.println(sb);
    }
}