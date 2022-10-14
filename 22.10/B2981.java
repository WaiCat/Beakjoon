import java.io.*;
import java.util.*;

public class B2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int gd = arr[1] - arr[0];

        for (int i = 2; i < n; i++) {
            gd = gcd(gd, arr[i] - arr[i - 1]);
        }

        for (int i = 2; i <= gd; i++) {

            if (gd % i == 0) {
                sb.append(i + " ");
            }
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}