import java.util.*;

public class B1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int num = 1;
        if (b >= c) {
            num = -1;
        } else {
            num = a / (c - b) + 1;
        }
        System.out.println(num);
        sc.close();
    }
}
