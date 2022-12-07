import java.io.*;
import java.util.*;

public class B1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int minE = arr[0][1];

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i][1] == minE) {
                index = i + 1;
                break;
            }
        }
        int count = 1;
        int min = minE;

        while (index < n) {
            minE = min;
            min = arr[index][1];
            int status = 0;

            for (; index < n; index++) {
                if (arr[index][0] >= minE) {
                    if (status == 0) {
                        min = arr[index][1];
                        count++;
                        status = 1;
                        continue;
                    }
                    if (arr[index][1] <= min) {
                        min = arr[index][1];
                    }
                    if (arr[index][0] == arr[index][1]) {
                        index++;
                        count++;
                        break;
                    }
                    if (arr[index][0] >= min) {
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}