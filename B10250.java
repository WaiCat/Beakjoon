import java.util.*;

public class B10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int c = sc.nextInt();
            int num = 0;
            for (int j = 1; j <= w; j++) {
                for (int j2 = 1; j2 <= h; j2++) {
                    c--;
                    if (c == 0) {
                        num = j2 * 100 + j;
                        break;
                    }
                }
                if (c == 0) {

                    break;
                }
            }
            System.out.println(num);
        }
        sc.close();
    }
}