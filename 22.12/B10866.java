import java.io.*;
import java.util.*;

public class B10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            
            if(str.equals("push_back")){
                int k = Integer.parseInt(st.nextToken());
                stack.addLast(k);
            }else if(str.equals("push_front")){
                int k = Integer.parseInt(st.nextToken());
                stack.addFirst(k);
            }else if(str.equals("size")){
                sb.append(stack.size()+"\n");
            }else if(str.equals("empty")){
                if(stack.isEmpty()){
                    sb.append(1+"\n");
                }else{
                    sb.append(0+"\n");
                }
            }else if(stack.isEmpty()){
                sb.append(-1+"\n");
            }else if(str.equals("front")){
                sb.append(stack.getFirst()+"\n");
            }else if(str.equals("back")){
                sb.append(stack.getLast()+"\n");
            }else if(str.equals("pop_back")){
                sb.append(stack.removeLast()+"\n");
            }else if(str.equals("pop_front")){
                sb.append(stack.removeFirst()+"\n");
            }
        }
        System.out.println(sb);
    }
}
