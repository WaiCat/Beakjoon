import java.util.Scanner;

public class B2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'c') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (c == 'd') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'z') {
                        if (i < str.length() - 2) {
                            if (str.charAt(i + 2) == '=') {
                                i+=2;
                            }
                        }
					}
					if (str.charAt(i + 1) == '-') {
                        i++;
					}
                    
                }
            } else if (c == 'l') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (c == 'n') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            } else if (c == 's') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            } else if (c == 'z') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
			n++;
		}
		System.out.println(n);
		sc.close();
    }
}
