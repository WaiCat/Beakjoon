import java.util.*;

public class B25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int num = sc.nextInt();
            sum -= money * num;
        }
        if (sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
