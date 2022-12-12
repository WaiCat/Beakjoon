import java.io.*;
import java.util.*;

public class B4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            Stack<Character> stack = new Stack<>();
            Boolean status = true;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.empty()) {
                        status = false;
                        break;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        status = false;
                        break;
                    }
                } else if (ch == '[') {
                    stack.push(ch);
                } else if (ch == ']') {
                    if (stack.empty()) {
                        status = false;
                        break;
                    } else if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        status = false;
                        break;
                    }
                }
            }
            if (status && stack.empty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}