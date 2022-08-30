import java.util.*;

public class B10872{
        public static void fac(int n, int result)
        {
            if(n==0 || n==1){
                System.out.println(result);
                return;
            }
            result *= n;
            fac(n-1, result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fac(n,1);
        sc.close();
    }
}
