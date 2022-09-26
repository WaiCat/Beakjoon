import java.io.*;
import java.util.*;


public class B18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] hash = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            hash[i] = arr[i];
        }
        hash = Arrays.stream(hash).distinct().toArray();
        Arrays.sort(hash);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < hash.length; i++) {
            map.put(hash[i], i);
        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(' ');
        }
        System.out.println(sb);
    }
}