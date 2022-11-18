import java.io.*;
import java.util.*;

public class B11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int sum = 0;

            if (b - a < n / 2) {
                for (int j = a - 1; j < b; j++) {
                    sum += arr[j];
                }
            }else{
                sum = total;
                for (int j = 0; j < a-1; j++) {
                    sum -= arr[j];
                }
                for (int j = b; j < n; j++) {
                    sum -= arr[j];
                }
            }

            System.out.println(sum);
        }
    }
}