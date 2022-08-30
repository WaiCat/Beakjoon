import java.util.*;

public class B1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean So[] = new boolean[n + 1];
        So[0] = So[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!So[i]) {
                for (int j = i * i; j <= n; j += i) {
                    So[j] = true;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if (!So[i]) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
