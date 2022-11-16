import java.io.*;
import java.util.*;

public class B10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        long[] count = new long[m];

        arr[0] = Integer.parseInt(st.nextToken()) % m;
        count[(int) arr[0]]++;

        for (int i = 1; i < n; i++) {
            arr[i] = (arr[i - 1] + Integer.parseInt(st.nextToken())) % m;
            count[(int) arr[i]]++;
        }

        long c = count[0];

        for (int i = 0; i < m; i++) {
            c += (count[i] * (count[i] - 1)) / 2;
        }

        System.out.println(c);
    }
}