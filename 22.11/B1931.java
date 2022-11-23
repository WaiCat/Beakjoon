import java.io.*;
import java.util.*;

public class B1931 {

    static int n;
    static int[][] arr;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        int a = arr[0][1];

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int in=0;
        for (int i = 0; i < n; i++) {
            if(arr[i][1] == a){
                in = i;
                break;
            }
        }

        count = 0;
        int index = in;
        while(true){
            int min = arr[index][1];

            for (int i = index; i < n; i++) {
                if(arr[i][0]<arr[index][1]){
                    min = arr[index][1];
                    continue;
                }
                else if(arr[i][0] > min){
                    count++;
                    break;
                }
                else if(arr[i][1] <= min){
                    index=i;
                }
            }


        }
    }
}