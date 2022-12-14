import java.io.*;

public class B10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        int index = 0;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                index--;
                sum -= arr[index];
                arr[index] = 0;
            } else {
                sum += num;
                arr[index] = num;
                index++;
            }
        }

        System.out.println(sum);
    }
}
