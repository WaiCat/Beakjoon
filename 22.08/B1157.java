import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class B1157{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String str1 = str.toUpperCase();
        byte[] bytes = str1.getBytes(StandardCharsets.US_ASCII);
        int[] num = new int[26];

        for(int i=0; i<bytes.length; i++){
            num[bytes[i]-65]++;
        }

        int max = 0;
        int status = 0;
        int k=0;
        for(int i=0; i<26; i++){
            if(max<num[i]){
                max = num [i];
                status = 0;
                k=i;
            }
            else if(max==num[i])
                status = 1;
        }

        if(status == 1)
            System.out.print("?");
        else
            System.out.println((char)(k+65));

        sc.close();
    }
}
