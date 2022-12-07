import java.io.*;

public class B1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int sum = 0;
        int index = 0;
        boolean de = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                sum = Integer.parseInt(str.substring(0, i));
                if (str.charAt(i) == '-') {
                    de = true;
                }
                index = i + 1;
                break;
            }
        }

        for (int i = index; i < str.length(); i++) {
            if (index == 0)
                break;
            if (str.charAt(index - 1) == '-') {
                de = true;
            }
            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                if (de) {
                    sum -= Integer.parseInt(str.substring(index, i));
                    index = i + 1;
                } else {
                    sum += Integer.parseInt(str.substring(index, i));
                    index = i + 1;
                }
            }
        }

        if (de) {
            sum -= Integer.parseInt(str.substring(index, str.length()));
        } else {
            sum += Integer.parseInt(str.substring(index, str.length()));
        }
        System.out.println(sum);
    }
}