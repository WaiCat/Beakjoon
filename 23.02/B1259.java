import java.io.*;

public class B1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String n = br.readLine();
            if (n.equals("0")) {
                break;
            } else {
                Boolean s = false;
                for (int i = 0; i < n.length() / 2; i++) {
                    if (n.charAt(i) != n.charAt(n.length() - i - 1)) {
                        s = true;
                        break;
                    }
                }
                if (s) {
                    sb.append("no").append("\n");
                } else {
                    sb.append("yes").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
