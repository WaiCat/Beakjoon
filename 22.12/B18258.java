import java.io.*;
import java.util.*;

public class B18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("push")) {
                int a = Integer.parseInt(st.nextToken());
                q.add(a);
            } else if (str.equals("size")) {
                sb.append(q.size()).append('\n');
            } else if (str.equals("empty")) {
                if (q.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if (q.isEmpty()) {
                sb.append(-1).append('\n');
            } else {
                if (str.equals("front")) {
                    sb.append(q.getFirst()).append('\n');
                } else if (str.equals("back")) {
                    sb.append(q.getLast()).append('\n');
                } else if (str.equals("pop")) {
                    sb.append(q.removeFirst()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}