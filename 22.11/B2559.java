import java.io.*;
import java.util.*;

public class B2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] de = new int[n - m + 1];

        st = new StringTokenizer(br.readLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        for (int i = 0; i <= n - m; i++) {

            if (m < n / 2) {
                for (int j = i; j < i + m; j++) {
                    de[i] += arr[j];
                }
            } else {
                de[i] = total;
                for (int j = 0; j < i; j++) {
                    de[i] -= arr[j];
                }
                for (int j = i + m; j < n; j++) {
                    de[i] -= arr[j];
                }
            }
        }
        Arrays.sort(de);
        System.out.println(de[n - m]);
    }
}