import java.io.*;
import java.util.*;

public class B12851 {

    static class Position {
        int value;
        int level;

        public Position(int value, int level) {
            this.value = value;
            this.level = level;
        }
    }

    static class Count {
        int level;
        int count;

        public Count(int level, int count) {
            this.level = level;
            this.count = count;
        }
    }

    static HashMap<Integer, Count> countMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        Deque<Position> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[100001];
        countMap = new HashMap<>();

        queue.add(new Position(start, 0));
        visited[start] = true;

        int result = 0;
        int totalCount = 1;

        if (start > target) {
            System.out.println(start - target);
        } else if (start == target) {
            System.out.println(0);
        } else {
            while (!queue.isEmpty()) {
                Position current = queue.poll();
                int value = current.value;
                int level = current.level + 1;

                if ((value - 1) == target || (value + 1) == target || (value * 2) == target) {
                    result = level;
                    if (countMap.containsKey(value)) {
                        totalCount = countMap.get(value).count;
                    }

                    while (!queue.isEmpty() && result == level) {
                        current = queue.poll();
                        value = current.value;
                        level = current.level + 1;

                        if ((value - 1) == target || (value + 1) == target || (value * 2) == target) {
                            totalCount += countMap.get(value).count;
                        }
                    }
                    break;
                }

                addToQueueIfNotVisited(queue, visited, value, value - 1, level);
                addToQueueIfNotVisited(queue, visited, value, value * 2, level);
                addToQueueIfNotVisited(queue, visited, value, value + 1, level);
            }

            System.out.println(result);
        }
        System.out.println(totalCount);
    }

    private static void addToQueueIfNotVisited(Deque<Position> queue, boolean[] visited, int pastValue, int nextValue, int level) {
      if (nextValue >= 0 && nextValue < visited.length) {
            if (!visited[nextValue]) {
                visited[nextValue] = true;
                if (countMap.containsKey(pastValue)) {
                    countMap.put(nextValue, new Count(level, countMap.get(pastValue).count));
                } else {
                    countMap.put(nextValue, new Count(level, 1));
                }
                queue.add(new Position(nextValue, level));
            } else {
              if (countMap.containsKey(nextValue) && level == countMap.get(nextValue).level) {
                if (countMap.containsKey(pastValue)) {
                  countMap.replace(nextValue, new Count(countMap.get(nextValue).level, countMap.get(nextValue).count + countMap.get(pastValue).count));
                }
                else {
                  countMap.replace(nextValue, new Count(countMap.get(nextValue).level, countMap.get(nextValue).count + 1));
                }
                }
            }
        }
    }
}
