import java.io.*;
import java.util.*;

public class B5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        int[] st = new int[2];
        int c = 0;

        for (int i = 0; i < 28; i++) {
            arr[Integer.parseInt(br.readLine())-1]++;
        }
        for (int i = 0; i < 30; i++) {
            if(arr[i]==0){
                st[c]=i+1;
                c++;
            }
        }
        Arrays.sort(st);
        System.out.println(st[0]);
        System.out.println(st[1]);
    }
}