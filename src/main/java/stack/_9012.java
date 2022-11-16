package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _9012 {
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String s = br.readLine();
            stack.clear();
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == '('){
                    stack.push(s.charAt(j));
                }
                else if(s.charAt(j) == ')'){
                    if(stack.empty()){
                        stack.push(s.charAt(j));
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.empty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}