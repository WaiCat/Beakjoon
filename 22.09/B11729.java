import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class B11729 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void hanoi(int n, char first, char second, char third) throws IOException {

        if (n == 1) {
            bw.write(first + " " + third + "\n");
            return;
        }
        hanoi(n - 1, first, third, second);
        bw.write(first + " " + third + "\n");
        hanoi(n - 1, second, first, third);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char a = '1';
        char b = '2';
        char c = '3';
        bw.write((int) (Math.pow(2, n) - 1) + "\n");
        hanoi(n, a, b, c);

        bw.flush();
		bw.close();
        
    }
}
