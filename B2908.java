import java.util.Scanner;

public class B2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String num1 = "";
        String num2 = "";

        for (int i = str1.length(); i > 0; i--) {
            num1 = num1 + str1.charAt(i - 1);
        }
        for (int i = str2.length(); i > 0; i--) {
            num2 = num2 + str2.charAt(i - 1);
        }
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }

        sc.close();
    }
}