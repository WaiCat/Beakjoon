import java.io.*;

public class B1300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int l = 1;
        int r = m;

        while (l < r) {
            int count = 0;
            int mid = (l + r) / 2;

            for (int i = 1; i <= n; i++) {
                count += Math.min(mid / i, n);
            }
            if (count < m) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        System.out.println(l);
    }
}