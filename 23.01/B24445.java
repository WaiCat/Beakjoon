import java.io.*;
import java.util.*;

public class B24445 {

    static boolean visited[];
    static ArrayList<Integer>[] list;
    static int count = 1;
    static int[] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];

        list = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<Integer>(); // 빈값허용
        }

        arr = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }
        visited[s] = true;
        for (int i = 1; i < n + 1; i++) {
            Collections.sort(list[i], Collections.reverseOrder());
        }
        bfs(s);
        for (int i = 1; i < n + 1; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);

    }

    public static void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while (!q.isEmpty()) {
            int k = q.poll();
            arr[k] = count++;
            for (int i : list[k]) {
                if (!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
