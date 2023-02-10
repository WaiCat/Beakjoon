import java.io.*;
import java.util.*;

public class B13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        long sum = n;

        for (int i = 0; i < n; i++) {
            arr[i] -= b;
            if (arr[i] > 0) {
                if (arr[i] % c == 0) {
                    sum += arr[i] / c;
                } else {
                    sum += arr[i] / c + 1;
                }
            }
        }
        System.out.println(sum);


    }
}
