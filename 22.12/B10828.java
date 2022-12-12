import java.io.*;
    import java.util.*;

public class B10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        int size = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            if (str.equals("push")) {
                arr[size] = Integer.parseInt(st.nextToken());
                size++;
            } else if (str.equals("top")) {
                if (size == 0) {
                    System.out.println(-1);

                } else {
                    System.out.println(arr[size-1]);
                }
            } else if (str.equals("pop")) {
                if (size == 0) {
                    System.out.println(-1);

                } else {
                    System.out.println(arr[size-1]);
                    size--;
                }
            } else if (str.equals("size")) {
                System.out.println(size);
            } else if (str.equals("empty")) {
                if (size == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}