import java.io.*;
import java.util.*;

public class B10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr =  new int[201];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(st.nextToken())+100]++;
        }
        int m = Integer.parseInt(br.readLine());
        System.out.println(arr[m+100]);
    }
}
