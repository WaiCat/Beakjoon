import java.io.*;
import java.util.*;

public class B24480 {

    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static StringBuilder sb = new StringBuilder();
    static int count = 1;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        list = new ArrayList[n + 1];
        arr = new int[n + 1];

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

        arr[s] = count++;
        visited[s] = true;
        for (int i = 1; i < n + 1; i++) {
            Collections.sort(list[i], Collections.reverseOrder());
        }
        dfs(s);

        for (int i = 1; i < n + 1; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int s) {
        for (int i : list[s]) {
            if (visited[i]) {
                continue;
            } else {
                arr[i] = count++;
                visited[i] = true;
                dfs(i);
            }
        }
    }
}