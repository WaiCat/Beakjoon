import java.io.*;
import java.util.*;

public class B2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[100][100];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c=b;
            for (int j = 0; j < 10; j++) {
                for (int j2 = 0; j2 < 10; j2++) {
                    arr[a][c]++;
                    c++;
                }
                c=b;
                a++;
            }
        }
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(arr[i][j]!=0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}