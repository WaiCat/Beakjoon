import java.io.*;
import java.util.*;

public class B2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> index = new Stack<>();

        sb.append(0).append(" ");
        stack.push(Integer.parseInt(st.nextToken()));
        index.push(1);

        for (int i = 2; i <= n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (stack.peek() > a) {
                stack.push(a);
                sb.append(index.peek()).append(" ");
                index.push(i);
            } else {
                while (true) {
                    if (stack.isEmpty()) {
                        stack.push(a);
                        index.push(i);
                        sb.append(0).append(" ");
                        break;
                    } else if (stack.peek() < a) {
                        stack.pop();
                        index.pop();
                    } else {
                        stack.push(a);
                        sb.append(index.peek()).append(" ");
                        index.push(i);
                        break;
                    }
                }
            }

        }
        System.out.println(sb);

    }
}
