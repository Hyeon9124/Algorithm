package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _11899 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }
                else {
                    stack.push(s.charAt(i));
                }
            }
        }
        System.out.println(stack.size());
    }
}