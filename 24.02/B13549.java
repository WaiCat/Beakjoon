import java.io.*;
import java.util.*;

public class B13549 {

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

        Deque<Bfs> deque = new ArrayDeque<>();
        boolean[] visited = new boolean[100001];  // 배열 크기를 적절하게 조절할 수 있음
        int result = 0;

        deque.add(new Bfs(n, 0));
        visited[n] = true;

        if (n > k) {
            System.out.println(n - k);
        } else if (n == k) {
            System.out.println(0);
        } else {
            while (!deque.isEmpty()) {
                Bfs current = deque.poll();
                int value = current.value;
                int num = current.num;

                if (value == k) {
                    result = num;
                    break;
                }
                
                addTodequeInFirst(deque, visited, value * 2, num);
                addTodequeIfNotVisited(deque, visited, value - 1, num);
                addTodequeIfNotVisited(deque, visited, value + 1, num);
            }

            System.out.println(result);
        }
    }

    private static void addTodequeIfNotVisited(Deque<Bfs> deque, boolean[] visited, int value, int num) {
        if (value >= 0 && value < visited.length && !visited[value]) {
        visited[value] = true;
        deque.add(new Bfs(value, num + 1));
        }
    }
    private static void addTodequeInFirst(Deque<Bfs> deque, boolean[] visited, int value, int num) {
        if (value >= 0 && value < visited.length && !visited[value]) {
            visited[value] = true;
            deque.addFirst(new Bfs(value, num));
        }
    }
}
