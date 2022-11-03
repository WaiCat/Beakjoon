import java.io.*;
import java.util.*;

public class B14888 {

    static int[] arr;
    static int[] op = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        loop(arr[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    public static void loop(int num, int index) {
        if (index == n) {
            max = Math.max(num, max);
            min = Math.min(num, min);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) {
                op[i]--;

                switch (i) {
                    case 0:
                        loop(num + arr[index], index + 1);
                        break;
                    case 1:
                        loop(num - arr[index], index + 1);
                        break;
                    case 2:
                        loop(num * arr[index], index + 1);
                        break;
                    case 3:
                        loop(num / arr[index], index + 1);
                        break;
                }

                op[i]++;
            }
        }
    }
}