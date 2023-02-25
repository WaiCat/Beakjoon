import java.io.*;

public class B1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();
        String r = br.readLine();

        long n = (10 * check(s) + check(t)) * (long) Math.pow(10, check(r));
        System.out.println(n);
    }

    public static int check(String color) {
        if (color.equals("black")) {
            return 0;
        } else if (color.equals("brown")) {
            return 1;
        } else if (color.equals("red")) {
            return 2;
        } else if (color.equals("orange")) {
            return 3;
        } else if (color.equals("yellow")) {
            return 4;
        } else if (color.equals("green")) {
            return 5;
        } else if (color.equals("blue")) {
            return 6;
        } else if (color.equals("violet")) {
            return 7;
        } else if (color.equals("grey")) {
            return 8;
        } else if (color.equals("white")) {
            return 9;
        }
        return 0;
    }
}
