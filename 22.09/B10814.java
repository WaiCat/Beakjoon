import java.io.*;
import java.util.*;

public class B10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] str = new String[n][2];

        for (int i = 0; i < n; i++) {
            str[i] = br.readLine().split(" ");
        }

        Arrays.sort(str, (e1, e2) -> {
            return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i][0] + " " + str[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}