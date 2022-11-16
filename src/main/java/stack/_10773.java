package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _10773 {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0; i < K; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                stack.push(num);
            }
            else{
                stack.pop();
            }
        }
        for(int i = 0; i < stack.size(); i++){
            sum += stack.get(i);
        }
        System.out.println(sum);
    }
}