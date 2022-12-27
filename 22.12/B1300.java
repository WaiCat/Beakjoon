import java.io.*;
import java.util.*;

public class B1300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int l = 1;
        int r = n * n;

        int mid = (l + r) / 2;
        while (l < r) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                count += mid / i < n ? mid / i : n;
            }
            if (count < m) {
                l = mid+1;
            } else {
                r = mid;
            }
            mid = (l + r) / 2;
        }
        System.out.println(mid);
    }
}