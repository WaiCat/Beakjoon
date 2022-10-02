import java.io.*;

public class B3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double r = Double.parseDouble(br.readLine());

        System.out.println(r * r * Math.PI);
        System.out.println(2 * r * r);
    }
}
