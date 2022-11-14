import java.io.*;
import java.util.StringTokenizer;

public class B1149 {

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n][3];

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==0){
                    arr[i][j] += Math.min(arr[i-1][1], arr[i-1][2]);

                }else if(j==1){
                    arr[i][j] += Math.min(arr[i-1][2], arr[i-1][0]);

                }else{
                    arr[i][j] += Math.min(arr[i-1][0], arr[i-1][1]);

                }
            }
            
        }
        int min = 0;
        for (int i = 1; i < 3; i++) {
            if(arr[n-1][min] > arr[n-1][i]){
                min = i;
            }
        }
        System.out.println(arr[n-1][min]);
    }
}