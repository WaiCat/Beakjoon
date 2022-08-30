import java.util.*;
import java.math.*;

public class B10757 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger sum =  a.add(b);
        
        System.out.println(sum);
        sc.close();
    }
}
