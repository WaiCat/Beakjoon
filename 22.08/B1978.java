import java.util.*;

public class B1978 {
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
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (So(num)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
