package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _1874 {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];

        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());  // 숫자 입력
        }
        int count = 1;
        for(int i = 1; i <= N; i++){
            stack.push(i);
            sb.append("+").append('\n');
            while(!stack.empty() && stack.peek() == arr[count]){
                // 스택이 비어있지 않고, 스택 맨 위의 값이 arr[count] 이면
                stack.pop();
                sb.append("-").append('\n');
                count++;
            }
        }
        if(stack.empty()){  // 스택이 비어있으면
            System.out.println(sb);
        }
        else{
            System.out.println("NO");
        }
    }
}