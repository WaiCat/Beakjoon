import java.io.*;

public class B9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        long [] arr = new long[100];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 3;
        arr[6] = 4;
        arr[7] = 5;
        arr[8] = 7;
        arr[9] = 9;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if (arr[n - 1] != 0) {
                System.out.println(arr[n - 1]);
            } else {
                arr[n-1] = su(arr, n-1);
                System.out.println(arr[n - 1]);
            }
        }
    }

    public static long su(long[] arr, int n) {
        if (arr[n - 1] != 0 && arr[n - 5] != 0) {
            arr[n] = arr[n - 1] + arr[n - 5];
            return arr[n];
        }

        else{
            return su(arr, n-1) + su(arr, n-5);
        }
    }
}