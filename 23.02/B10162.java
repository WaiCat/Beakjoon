import java.io.*;

public class B10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 0;
        int c = 0;

        if (n % 10 != 0) {
            System.out.println(-1);
        } else {
            a = n / 300;
            n %= 300;
            b = n / 60;
            n %= 60;
            c = n / 10;

            System.out.println(a + " " + b + " " + c);
        }
    }
}
