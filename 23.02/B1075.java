import java.io.*;

public class B1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());
        long f = Integer.parseInt(br.readLine());

        long a = f - n % f;
        n = (n % 100 + a) % f;

        if (n < 10) {
            System.out.println("0" + n);
        } else {
            System.out.println(n);
        }
    }
}
