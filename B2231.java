import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int min = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = i;
            int k = i;
            while (k > 10) {
                sum += k % 10;
                k = k / 10;
            }
            sum += k;
            if (sum == n) {
                min = i;
                break;
            }
        }
        System.out.println(min);
    }
}