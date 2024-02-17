import java.io.*;
import java.util.*;

public class B1697_bfs {

    static class Bfs {
        int value;
        int num;

        public Bfs(int value, int num) {
            this.value = value;
            this.num = num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Bfs> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[100001];  // 배열 크기를 적절하게 조절할 수 있음
        int result = 0;

        queue.add(new Bfs(n, 0));
        visited[n] = true;

        if (n > k) {
            System.out.println(n - k);
        } else if (n == k) {
            System.out.println(0);
        } else {
            while (!queue.isEmpty()) {
                Bfs current = queue.poll();
                int value = current.value;
                int num = current.num + 1;

                if ((value - 1) == k || (value + 1) == k || (value * 2) == k) {
                    result = num;
                    break;
                }

                addToQueueIfNotVisited(queue, visited, value - 1, num);
                addToQueueIfNotVisited(queue, visited, value * 2, num);
                addToQueueIfNotVisited(queue, visited, value + 1, num);
            }

            System.out.println(result);
        }
    }

    private static void addToQueueIfNotVisited(Deque<Bfs> queue, boolean[] visited, int value, int num) {
        if (value >= 0 && value < visited.length && !visited[value]) {
            visited[value] = true;
            queue.add(new Bfs(value, num));
        }
    }
}
