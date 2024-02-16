import java.io.*;
import java.util.*;

public class B13913 {

    static class Bfs {
        int value;
        int num;
        Deque<Integer> d = new ArrayDeque<>();

        public Bfs(int value, int num, Deque<Integer> d) {
            this.value = value;
            this.num = num;
            this.d = d;
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
        Deque<Integer> route = new ArrayDeque<>();
        route.add(n);

        deque.add(new Bfs(n, 0, route));
        visited[n] = true;

        if (n > k) {
          System.out.println(n - k);
          for (int i = n; i >= k; i--) {
            System.out.print(i + " ");
        }
        } else if (n == k) {
          System.out.println(0);
            System.out.println(n);
          } else {
            while (!deque.isEmpty()) {
              Bfs current = deque.poll();
              int value = current.value;
              int num = current.num + 1;
              Deque<Integer> d = current.d;

              if ((value - 1) == k || (value + 1) == k || (value * 2) == k) {
                result = num;
                route = d;
                route.add(k);
                break;
              }

              addTodequeIfNotVisited(deque, visited, value - 1, num, d);
              addTodequeIfNotVisited(deque, visited, value * 2, num, d);
              addTodequeIfNotVisited(deque, visited, value + 1, num, d);
            }

            System.out.println(result);

            for (Integer element : route) {
            System.out.print(element + " ");
        }
          }
        
    }

    private static void addTodequeIfNotVisited(Deque<Bfs> deque, boolean[] visited, int value, int num, Deque<Integer> d) {
        if (value >= 0 && value < visited.length && !visited[value]) {
          visited[value] = true;
          Deque<Integer> newDeque = new ArrayDeque<>(d);
          newDeque.add(value);
            deque.add(new Bfs(value, num, newDeque));
        }
    }
}
