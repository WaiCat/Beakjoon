import java.io.*;
import java.util.*;

public class B2606 {

    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        visited = new boolean[n + 1];
        list = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<Integer>(); // 빈값허용
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        visited[1] = true;
        dfs(1);

        System.out.println(count);
    }

    public static void dfs(int s) {
        for (int i : list[s]) {
            if (visited[i]) {
                continue;
            } else {
                visited[i] = true;
                count++;
                dfs(i);
            }
        }
    }
}