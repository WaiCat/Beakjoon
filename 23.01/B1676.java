import java.io.*;

public class B1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                count++;
                if (i % 25 == 0) {
                    count++;
                    if (i % 125 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}