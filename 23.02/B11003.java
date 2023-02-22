import java.io.*;
import java.util.*;

public class B11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<node> de = new LinkedList<>();

        int[] min = new int[n];

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            while (!de.isEmpty() && de.getLast().value >= a) {
                de.removeLast();
            }
            de.addLast(new node(a, i));

            if (de.getFirst().index < i - l + 1) {
                de.removeFirst();
            }
            sb.append(de.getFirst().value).append(" ");
        }
        System.out.println(sb);
    }

    static class node {
        int value;
        int index;

        node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
