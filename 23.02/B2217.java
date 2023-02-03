
import java.io.*;
import java.util.*;

public class B2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int sum = arr[n - 1];

        for (int i = 1; i <= n - 1; i++) {
            int num = arr[n - i - 1] * (i + 1);
            if (sum < num) {
                sum = num;
            }

        }

        System.out.println(sum);
    }
}
