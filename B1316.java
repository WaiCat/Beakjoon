import java.util.*;

public class B1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String k = sc.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int[] num = new int[26];
            String str = sc.nextLine();
            int status = 0;
            for (int j = 0; j < str.length(); j++) {
                int c = str.charAt(j)-97;
                if(j> 0){
                    if(c==str.charAt(j-1)-97){
                        continue;
                    }
                }
                if(num[c]!=0){
                    status = 1;
                }
                num[c]++;
            }
            if(status == 1){
                continue;
            }
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}