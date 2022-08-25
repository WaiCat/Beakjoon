import java.util.*;
//에라토스테네스의 체로 풀어야 시간초과 해결됨

public class B1929 {
    public static boolean So(int n) {
        if (n == 1) {
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
        for (; n <= m; n++) {
            if (So(n)) {
                System.out.println(n);
            }
        }
        sc.close();
    }
}