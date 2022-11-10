import java.io.*;

public class B1904 {
    static int[] arr = new int [1000001];
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i < n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 15746;
        }

        System.out.println(arr[n-1]);
    }
}