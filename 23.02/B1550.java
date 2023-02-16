import java.io.*;

public class B1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = new String(br.readLine());

        int n = 0;

        int l  = str.length();

        for (int i = 0; i < l; i++) {

            int a = str.charAt(l-i-1);

            if (a > 64) {
                a -= 55;
            } else {
                a -= 48;
            }
            n += a * Math.pow(16, i);
        }

        System.out.println(n);
    }
}
