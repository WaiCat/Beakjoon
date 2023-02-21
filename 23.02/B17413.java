import java.io.*;
import java.util.*;

public class B17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "<> ", true);
        StringBuilder sb = new StringBuilder();

        int n = st.countTokens();

        for (int i = 0; i < n; i++) {
            String str = st.nextToken();
            if (str.contains("<")) {
                sb.append(str);
                while (true) {
                    str = st.nextToken();
                    sb.append(str);
                    i++;
                    if (str.contains(">")) {
                        break;
                    }
                }
            } else {
                StringBuffer s = new StringBuffer(str);
                sb.append(s.reverse().toString());
            }

        }
        System.out.println(sb);
    }
}
