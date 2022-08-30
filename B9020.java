import java.util.*;

public class B9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean So[] = new boolean[10001];
            So[0] = So[1] = true;

              for (int i = 2; i * i <= 10000; i++) {
                if (!So[i]) {
                    for (int j = i * i; j <= 10000; j += i) {
                        So[j] = true;
                    }
                }
            }

        for (int k = 0; k < num; k++) {
            int n = sc.nextInt();
            
            for (int i = n / 2; i > 0; i--) {
                int a = 0;
                int b = 0;
                if (!So[i]) {
                    a = i;
                    for (int j = a; j < n; j++) {
                        if (!So[j]) {
                            b = j;
                            if (a + b == n) {
                                System.out.println(a + " " + b);
                                break;
                            }
                        }
                    }
                    if (a + b == n) {
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}