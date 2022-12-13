import java.io.*;

public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int a = 0;
            int b = 0;

            Boolean status = true;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(') {
                    a++;
                } else {
                    b++;
                    if(b>a){
                        status = false;
                        break;
                    }
                }
            }
            if (a == b && status) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}