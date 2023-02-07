import java.io.*;
import java.util.*;

public class B10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> d = new ArrayDeque<>();


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            if (str.equals("push")) {
                int a = Integer.parseInt(st.nextToken());
                d.add(a);
            } else if (str.equals("size")) {
                sb.append(d.size()).append("\n");
            } else if (str.equals("empty")) {
                if (d.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (d.isEmpty()) {
                sb.append(-1).append("\n");
            } else if (str.equals("pop")) {
                sb.append(d.pollFirst()).append("\n");
            } else if (str.equals("front")) {
                sb.append(d.peekFirst()).append("\n");
            } else if (str.equals("back")) {
                sb.append(d.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
