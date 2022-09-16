import java.io.*;
import java.util.*;

public class B10815 {

    public static int Search(int n, int k, int[] arr) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] < k) {
                l = ++mid;
            } else if (arr[mid] > k) {
                r = --mid;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            sb.append(Search(n, Integer.parseInt(st.nextToken()), arr)).append(" ");
        }
        System.out.println(sb);
    }
}