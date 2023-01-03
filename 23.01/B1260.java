import java.io.*;
import java.util.*;

public class B1260 {

    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        list = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<Integer>(); // 빈값허용
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        sb.append(s).append(" ");
        visited[s] = true;
        for (int i = 1; i < n + 1; i++) {
            Collections.sort(list[i]);
        }
        dfs(s);

        sb.append("\n");

        visited = new boolean[n + 1];
        visited[s] = true;
        for (int i = 1; i < n + 1; i++) {
            Collections.sort(list[i]);
        }
        bfs(s);

        System.out.println(sb);
    }

    public static void dfs(int s) {
        for (int i : list[s]) {
            if (visited[i]) {
                continue;
            } else {
                sb.append(i).append(" ");
                visited[i] = true;
                dfs(i);
            }
        }
    }

    public static void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while (!q.isEmpty()) {
            int k = q.poll();
            sb.append(k).append(" ");
            for (int i : list[k]) {
                if (!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}