import java.io.*;
import java.util.StringTokenizer;

public class B2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[9][9];
        int[] max = new int[3];
        max[0] = -1;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max[0]) {
                    max[0] = arr[i][j];
                    max[1] = i+1;
                    max[2] = j+1;
                }
            }
        }
        System.out.println(max[0]);
        System.out.println(max[1] + " " +max[2]);
    }
}