import java.io.*;
import java.util.*;

public class B1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (n != 1) {
            Arrays.sort(arr);
            System.out.println(arr[0] * arr[n - 1]);
        } else if (n == 1) {
            System.out.println(arr[0] * arr[0]);
        }
    }
}