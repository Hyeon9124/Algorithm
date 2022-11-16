package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _4889 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;

        while(true){
            String s = br.readLine();
            if(s.contains("-")){
                break;
            }
            int cnt = 0;
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '{'){
                    stack.push(s.charAt(i));
                }
                else{
                    if(stack.empty()){
                        stack.push('{');
                        cnt++;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(!stack.empty()){
                cnt += stack.size() / 2;
            }
            System.out.println(count + ". " + cnt);
            count++;
        }
    }
}