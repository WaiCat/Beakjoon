import java.io.*;
import java.util.StringTokenizer;

public class B114425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            String s = br.readLine();

            for (int j = 0; j < n; j++) {
                if (str[j].equals(s)) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}