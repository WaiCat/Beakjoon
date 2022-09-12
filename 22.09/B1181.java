import java.io.*;
import java.util.*;

public class B1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(str));
        String[] resultstr = hashSet.toArray(new String[0]);

        Arrays.sort(resultstr, (e1, e2) -> {
            if (e1.length() == e2.length()) {
                return e1.compareTo(e2);
            } else {
                return e1.length() - e2.length();
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < resultstr.length; i++) {
            sb.append(resultstr[i]).append('\n');
        }
        System.out.println(sb);
    }
}