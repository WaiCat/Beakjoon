import java.util.Scanner;

public class B1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int a = sc.nextInt();
        final int b = sc.nextInt();

        if (a > b){
            System.out.println(">");
        }
        else if (b > a){
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }
        
        sc.close();
    }
}