import java.io.*;
import java.util.*;

public class B6603 {

    static int k;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            k = Integer.parseInt(st.nextToken());
            if (k == 0) {
                break;
            }
            arr = new int[k];

            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < k - 5; i++) {
                for (int i2 = i + 1; i2 < k - 4; i2++) {
                    for (int i3 = i2 + 1; i3 < k - 3; i3++) {
                        for (int i4 = i3 + 1; i4 < k - 2; i4++) {
                            for (int i5 = i4 + 1; i5 < k - 1; i5++) {
                                for (int i6 = i5 + 1; i6 < k; i6++) {
                                    sb.append(arr[i]).append(" ").append(arr[i2]).append(" ").append(arr[i3]).append(" ").append(arr[i4]).append(" ").append(arr[i5]).append(" ").append(arr[i6]).append("\n");
                                }
                            }
                        }
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}