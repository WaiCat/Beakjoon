import java.io.*;
import java.util.*;

public class B13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] arr1 = new long[n - 1];
        long[] arr2 = new long[n];

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        long dis = arr1[0];
        long value = arr2[0];

        for (int i = 1; i < n - 1; i++) {

            if (value > arr2[i]) {
                sum += value * dis;
                dis = 0;
                value = arr2[i];
            }

            dis += arr1[i];
        }

        sum += value * dis;

        System.out.println(sum);
    }
}