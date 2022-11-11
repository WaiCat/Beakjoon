import java.io.*;
import java.util.StringTokenizer;

public class B1912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        arr[0] = Integer.parseInt(st.nextToken());
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr[i] = Math.max(arr[i] + arr[i - 1], arr[i]);
            max = Math.max(arr[i], max);
        }
        System.out.println(max);
    }
}