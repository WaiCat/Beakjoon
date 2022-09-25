import java.io.*;
import java.util.*;

public class B11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int s = str.length();
        Set<String> set = new HashSet<>();
        int c = 1;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j + c <= s; j++) {
                set.add(str.substring(j, j + c));
            }
            c++;
        }
        System.out.println(set.size());
    }
}