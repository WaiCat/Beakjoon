import java.io.*;
import java.util.*;

public class B10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] dp1 = new long[10];
        long[] dp2 = new long[10];


        for (int i = 0; i < 10; i++) {
            dp1[i] = 1;
        }

        boolean status = false;

        for (int i = 1; i < n; i++) {
            if (status) {
                dp1[0] = dp2[1];
                for (int j = 1; j < 9; j++) {
                    dp1[j] = (dp2[j - 1] + dp2[j + 1]) % 1000000000;
                }
                dp1[9] = dp2[8];
                status = !status;
            } else {
                dp2[0] = dp1[1];
                for (int j = 1; j < 9; j++) {
                    dp2[j] = (dp1[j - 1] + dp1[j + 1]) % 1000000000;
                }
                dp2[9] = dp1[8];
                status = !status;
            }
        }

        long sum = 0;

        if (status) {
            for (int i = 1; i < 10; i++) {
                sum = (sum + dp2[i]) % 1000000000;
            }
        } else {
            for (int i = 1; i < 10; i++) {
                sum = (sum + dp1[i]) % 1000000000;
            }
        }

        System.out.println(sum);

    }
}
