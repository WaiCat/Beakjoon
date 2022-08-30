import java.util.*;

public class B4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int count = 0;
            boolean So[] = new boolean[n * 2 + 1];
            So[0] = So[1] = true;

            for (int i = 2; i * i <= n * 2; i++) {
                if (!So[i]) {
                    for (int j = i * i; j <= n * 2; j += i) {
                        So[j] = true;
                    }
                }
            }

            for (int i = n + 1; i <= n * 2; i++) {
                if (!So[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
