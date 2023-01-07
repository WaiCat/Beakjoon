import java.io.*;

public class B9935 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String c4 = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (sb.length() >= c4.length()) {
                String a = sb.substring(sb.length() - c4.length(), sb.length());
                String b = c4.substring(0, c4.length());
                if (a.equals(b)) {
                    sb.delete(sb.length() - c4.length(), sb.length());
                }
            }
        }
        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb.toString());
        }
    }
}