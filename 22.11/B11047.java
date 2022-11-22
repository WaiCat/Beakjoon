import java.io.*;
import java.util.*;

public class B11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        int index = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] <= k) {
                index = i;
            }
        }

        int sum = 0;
        while (k != 0) {
            sum += k / arr[index];
            k = k % arr[index];
            index--;
        }
        System.out.println(sum);
    }
}