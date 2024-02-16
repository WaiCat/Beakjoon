import java.io.*;
import java.util.*;

public class B17071 {

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
        boolean[] visited = new boolean[500001];  // 배열 크기를 적절하게 조절할 수 있음
        int result = 0;
        int speed = 1;

        queue.add(new Bfs(n, 0));
        visited[n] = true;

        if (k > 500000) {
          System.out.println(-1);
        } else {
          if (n > k) {
            while (!queue.isEmpty()) {
              Bfs current = queue.poll();
              int value = current.value;
              int num = current.num + 1;
              if (num - 1 == speed) {
                k += speed++;
              }

              if (k > 500000) {
                result = -1;
                break;
              }
              if (value == k) {
                result = --num;
                break;
              }

              addToQueue(queue, value - 1, num);
              addToQueue(queue, value * 2, num);
              addToQueue(queue, value + 1, num);
            }
          }else if(n < k) {
            while (!queue.isEmpty()) {
              Bfs current = queue.poll();
              int value = current.value;
              int num = current.num + 1;
              if (num - 1 == speed) {
                k += speed++;
                if (k > 500000) {
                result = -1;
                break;
              }
                visited[k] = false;
              }
            
              if (value == k) {
                result = --num;
                break;
              }

              addToQueueIfNotVisited(queue, visited, value - 1, num);
              addToQueueIfNotVisited(queue, visited, value * 2, num);
              addToQueueIfNotVisited(queue, visited, value + 1, num);
            }
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
    
    private static void addToQueue(Deque<Bfs> queue, int value, int num) {
        if (value >= 0) {
            queue.add(new Bfs(value, num));
        }
    }
}
