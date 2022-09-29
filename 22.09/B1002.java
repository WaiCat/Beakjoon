import java.io.*;
import java.util.*;

public class B1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        double[][] arr = new double[t][6];

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 6; j++) {
                arr[i][j] = Double.parseDouble(st.nextToken());
            }
            double dis = Math.sqrt(Math.pow(arr[i][0] - arr[i][2], 2) + Math.pow(arr[i][1] - arr[i][3], 2));
            double sum = arr[i][4] + arr[i][5];
            double de = Math.abs(arr[i][4] - arr[i][5]);
            if (dis == de || dis == sum) {
                System.out.println("1");
            } else if (dis < sum && de < dis) {
                System.out.println("2");
            } else if (dis == 0 && arr[i][4] == arr[i][5]) {
                System.out.println("-1");
            } else {
                System.out.println("0");
            }
        }
    }
}