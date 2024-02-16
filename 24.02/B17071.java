import java.io.*;
import java.util.*;

public class B17071 {

    static class Bfs {
        int value;
        int time;

        public Bfs(int value, int time) {
            this.value = value;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Bfs> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[500001][2];
        int result = 0;
        int speed = 0;

        queue.add(new Bfs(n, 0));
        visited[n][0] = true;

        if (k > 500000) {
          System.out.println(-1);
        } else if (k == n) {
          System.out.println(0);
        } else {
            while (!queue.isEmpty()) {
              Bfs current = queue.poll();
              int value = current.value;
              int time = current.time;
              if (time > speed) {
                k += ++speed;
                if (k > 500000) {
                  result = -1;
                  break;
                }
                if (visited[k][time % 2]) {
                  result = speed;
                  break;
                }
              }

              addToQueueIfNotVisited(queue, visited, value - 1, time);
              addToQueueIfNotVisited(queue, visited, value * 2, time);
              addToQueueIfNotVisited(queue, visited, value + 1, time);
            }
          System.out.println(result);
        }
    }

    private static void addToQueueIfNotVisited(Deque<Bfs> queue, boolean[][] visited, int value, int time) {
      time++;
      if (value >= 0 && value < visited.length && !visited[value][time % 2]) {
        visited[value][time % 2] = true;
        queue.add(new Bfs(value, time));
      }
    }
}