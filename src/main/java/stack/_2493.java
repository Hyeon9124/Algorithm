package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
public class _2493 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<int[]> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int tower = Integer.parseInt(st.nextToken());

            while(!stack.empty()){
                if(stack.peek()[0] < tower){
                    stack.pop();
                }
                else{
                    System.out.print(stack.peek()[1] + " ");
                    break;
                }
            }
            if(stack.empty()){
                System.out.print("0 ");
            }
            stack.push(new int[] {tower, i + 1});
        }
    }
}