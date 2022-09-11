import java.io.*;
import java.util.*;

public class B1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<Integer>();

        while (n > 0) {
            list.add(n % 10);
            n = n / 10;
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            n += list.get(i) * Math.pow(10, i);
        }
        System.out.println(n);
    }
}