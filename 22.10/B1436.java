import java.io.*;

public class B1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int f = 0;
        int r = 0;
        int k = 0;
        if (n == 1) {
            System.out.println(666);
            return;
        }
        n--;
        while (true) {
            if (n == 0) {
                break;
            }
            k = 0;
            r = 0;
            f++;
            n--;
            if (f % 10 == 6) {
                r = 0;
                if (f % 100 == 66) {
                    if (f % 1000 == 666) {
                        k = 3;
                        for (int i = 0; i < 999; i++) {
                            if (n == 0) {
                                break;
                            }
                            r++;
                            n--;
                        }

                    } else {
                        k = 2;
                        for (int i = 0; i < 99; i++) {
                            if (n == 0) {
                                break;
                            }
                            r++;
                            n--;
                        }
                    }
                } else {
                    k = 1;
                    for (int i = 0; i < 9; i++) {
                        if (n == 0) {
                            break;
                        }
                        r++;
                        n--;
                    }
                }
            }
        }
        int sum = r;
        for (int i = 0; i < 3 - k; i++) {
            sum += 6 * (int) Math.pow(10, 2 - i);
        }
        System.out.println(sum + f * (int) Math.pow(10, 3));
    }
}