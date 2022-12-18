import java.io.*;
import java.util.*;

public class B2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        for (int i = 1; i < n; i++) {
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.poll());
    }
}
