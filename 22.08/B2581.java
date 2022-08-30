import java.util.*;

public class B2581 {
    public static boolean So(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int min = 0;
        int sum = 0;
        for (; n <= m; n++) {
            if (n == 2) {
                min = 2;
                sum += n;
            }
            if (So(n) && n % 2 != 0) {
                if (min == 0) {
                    min = n;
                }
                sum += n;
            }
        }
        if (min == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
