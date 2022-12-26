import java.io.*;
import java.util.*;

public class B1996 {

    static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            Queue<Integer> queue = new LinkedList<>();
            num = new int[10];

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < a; j++) {
                int k = Integer.parseInt(st.nextToken());
                queue.add(k);
                num[k]++;
            }
            int index = 0;

            int m = max();

            for (int j = 0; j <= b; b--) {
                int k = queue.poll();
                if (k == m) {
                    num[k]--;
                    m = max();
                    index++;
                } else {
                    queue.add(k);
                    if (b == 0) {
                        b = queue.size();
                    }
                }
            }
            sb.append(index + "\n");
        }
        System.out.println(sb);
    }

    public static int max() {
        int index = 0;

        for (int i = 9; i > 0; i--) {
            if (num[i] > 0) {
                index = i;
                break;
            }
        }
        return index;
    }
}