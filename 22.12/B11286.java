import java.io.*;
import java.util.*;

class Abs implements Comparable<Abs> {
    private int num;
    private int absnum;

    public Abs(int num) {
        this.num = num;
        this.absnum = Math.abs(num);
    }

    public int getnum() {
        return this.num;
    }

    public int getabsnum() {
        return this.absnum;
    }

    public int compareTo(Abs abs) {
        if (this.getabsnum() > abs.getabsnum()) {
            return 1;
        } else if (this.getabsnum() < abs.getabsnum()) {
            return -1;
        } else if (this.getabsnum() == abs.getabsnum()) {
            if (this.getnum() > abs.getnum()) {
                return 1;
            } else if (this.getnum() < abs.getnum()) {
                return -1;
            }
        }
        return 0;
    }
}

public class B11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Abs> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());

            if (k == 0) {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    Abs abs = pq.poll();
                    sb.append(abs.getnum()).append("\n");
                }
            } else {
                pq.add(new Abs(k));
            }
        }
        System.out.println(sb);
    }
}