import java.util.*;

public class B2775 {
    public static int mans(int a, int b){
        if(b==1){
            return 1;
        }
        if(a==0){
            return b;
        }
        return mans(a,b-1) + mans(a-1, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(mans(a,b));
        }
        sc.close();
    }
}