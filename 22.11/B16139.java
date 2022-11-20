import java.io.*;
import java.util.*;;

public class B16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int sl = str.length();

        char[] ch = new char[sl];

        int[][] arr = new int[sl][26];

        ch[0] = str.charAt(0);
        arr[0][(int) ch[0] - 97]++;

        for (int i = 1; i < ch.length; i++) {
            ch[i] = str.charAt(i);
                for (int j = 0; j < 26; j++) {
                    arr[i][j] = arr[i - 1][j];
                }
            arr[i][(int) ch[i] - 97]++;
        }

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int c = (int) st.nextToken().charAt(0) - 97;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int count = 0;

            if (a == 0) {
                count = arr[b][c];
            } else {
                count = arr[b][c] - arr[a - 1][c];
            }

            sb.append(count+"\n");
        }

        System.out.println(sb.toString());
    }
}