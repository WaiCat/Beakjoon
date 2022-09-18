import java.io.*;
import java.util.*;

public class B24060 {

    static int count = 0;
    static int k;
    static int[] tmp;

    public static void merge_sort(int[] A, int p, int r) {// A[p..r]을 오름차순 정렬한다.
        if (p < r) {
            int q = (p + r) / 2; // # q는 p, r의 중간 지점
            merge_sort(A, p, q); // # 전반부 정렬
            merge_sort(A, q + 1, r); // # 후반부 정렬
            merge(A, p, q, r); // # 병합
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } // tmp[t] <- A[i]; t++; i++;
            else {
                tmp[t++] = A[j++];
            } // tmp[t] <- A[j]; t++; j++;
        }
        while (i <= q) { // 왼쪽 배열 부분이 남은 경우
            tmp[t++] = A[i++];
        }
        while (j <= r) { // 오른쪽 배열 부분이 남은 경우
            tmp[t++] = A[j++];
        }
        i = p;
        t = 0;
        while (i <= r) { // 결과를 A[p..r]에 저장
            A[i++] = tmp[t++];
            if (++count == k) {
                tmp[tmp.length - 1] = A[i - 1];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        tmp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(arr, 0, n - 1);
        if (count < k) {
            System.out.println(-1);
        } else {
            System.out.println(tmp[n]);
        }
    }
}