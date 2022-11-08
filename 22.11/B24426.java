import java.io.*;

public class B24426 {
    static int count1 = 1;
    static int count2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibonacci(n);

        System.out.println(count1 + " " + count2);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            count1++;
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            count2++;
        }
        return f[n];
    }
}