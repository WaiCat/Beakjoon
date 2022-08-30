import java.util.*;

public class B11653 {
    public static boolean So(int n) {
        if (n == 1) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (So(n)) {
            if (n == 1) {
                break;  
            }
            for (int i = 2;; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    n = n / i;
                    break;
                }
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
        sc.close();
    }
}
