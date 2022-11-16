package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _17608 {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 막대기 개수

        for(int i = 0; i < N; i++){
            int stick = Integer.parseInt(br.readLine());

            while(!stack.empty() && check(stick)){
                stack.pop();
            }
            stack.push(stick);
        }
        System.out.println(stack.size());
    }
    public static boolean check(int stick){
        int cnt = (int)stack.peek();
        return stick >= cnt;
    }
}