package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _3986 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count  = 0;

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < s.length(); j++){
                if(!stack.empty() && stack.peek() == s.charAt(j)){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(j));
                }
            }
            if(stack.empty()){
                count++;
            }
        }
        System.out.println(count);
    }
}