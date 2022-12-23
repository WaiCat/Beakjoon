import java.io.*;
import java.util.*;

public class B5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Deque<Integer> d;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            boolean bo = true;

            String str = br.readLine();
            int k = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), "[],");

            d = new ArrayDeque<>();

            String sub = "[";
            for (int j = 0; j < k; j++) {
                d.add((Integer.parseInt(st.nextToken())));
            }
            for (int j = 0; j < str.length(); j++) {
                char s = str.charAt(j);
                if (s == 'D') {
                    if (d.size() == 0) {
                        sub = "error";
                        break;
                    } else if (bo) {
                        d.removeFirst();
                    } else {
                        d.removeLast();
                    }
                } else if (s == 'R') {
                    bo = !bo;
                }
            }
            if (sub.equals("error")) {
                sb.append(sub);
            } else {
                int s = d.size();
                sb.append("[");
                if (s > 0) {
                    for (int j = 1; j < s; j++) {
                        if (bo) {
                            sb.append(d.pollFirst()).append(",");
                        } else {
                            sb.append(d.pollLast()).append(",");
                        }
                    }
                    if (bo) {
                        sb.append(d.pollFirst());
                    } else {
                        sb.append(d.pollLast());
                    }
                }
                sb.append("]");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}