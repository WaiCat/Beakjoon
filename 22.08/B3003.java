import java.util.*;

public class B3003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int a = sc.nextInt();
            if(i==0 || i==1){
                System.out.println(1-a);
            }
            else if(i==5){
                System.out.println(8-a);
            }
            else{
                System.out.println(2-a);
            }
        }
        sc.close();
    }
}
