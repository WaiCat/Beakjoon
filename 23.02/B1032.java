import java.io.*;

public class B1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();
        int l = s.length();
        char[] arr = new char[l];
        for (int i = 0; i < l; i++) {
            arr[i] = s.charAt(i);
        }

        for (int i = 1; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < l; j++) {
                if (str.charAt(j) != arr[j]) {
                    arr[j] = '?';
                }
            }
        }

        for (int i = 0; i < l; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
