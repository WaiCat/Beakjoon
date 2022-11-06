import java.io.*;
import java.util.*;

public class B14889 {

    static int min = Integer.MAX_VALUE;
    static int n;
    static int[] team1;
    static int[] team2;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        StringTokenizer st;

        team1 = new int[n / 2];
        team2 = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            team1[i] = -1;
            team2[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        choice(0, 0);

        System.out.println(min);
    }

    public static void choice(int l, int count) {
        for (int i = l; i < n; i++) {
            team1[count] = i;
            if (count == n / 2 - 1) {
                int count2 = 0;
                for (int j = 0; j < n; j++) {
                    boolean t1 = contains(team1, j);
                    boolean t2 = contains(team2, j);

                    if (!t1 && !t2) {
                        team2[count2] = j;
                        count2++;
                    }
                }
                int sum1 = sum(team1);
                int sum2 = sum(team2);
                if (Math.abs(sum1 - sum2) < min) {
                    min = Math.abs(sum1 - sum2);
                }
                for (int j = 0; j < n / 2; j++) {
                    team2[j] = -1;
                } 
            }
            
            if (count < n / 2 -1) {
                choice(i + 1, count + 1);
                 
            }
        }
    }

    public static int sum(int[] list) {
        int s = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                s += arr[list[i]][list[j]];
            }
        }
        return s;
    }

    public static boolean contains(final int[] arr, final int key) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
            }
        }
        return found;
    }
}