import java.io.*;
import java.util.*;

public class B2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        int[] l = new int[2];
        int s = 0;
        int g = 0;

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            arr[i] = Integer.parseInt(st.nextToken());

            if (a == 1 || a == 2) {
                if (s < arr[i]) {
                    s = arr[i];
                    l[1] = i;
                }
            }
            if (a == 3 || a == 4) {
                if (g < arr[i]) {
                    g = arr[i];
                    l[0] = i;
                }
            }
        }
        int sum = arr[l[0]] * arr[l[1]];

        if (l[1] == 0) {
            l[1] = Math.abs(arr[1] - arr[5]);
        } else if (l[1] == 5) {
            l[1] = Math.abs(arr[0] - arr[4]);
        } else {
            l[1] = Math.abs(arr[l[1] - 1] - arr[l[1] + 1]);
        }
        if (l[0] == 0) {
            l[0] = Math.abs(arr[1] - arr[5]);
        } else if (l[0] == 5) {
            l[0] = Math.abs(arr[0] - arr[4]);
        } else {
            l[0] = Math.abs(arr[l[0] - 1] - arr[l[0] + 1]);
        }
        sum -= l[1] * l[0];
        System.out.println(sum * n);
    }
}