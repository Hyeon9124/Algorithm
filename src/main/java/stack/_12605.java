package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _12605 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++){
            String s = br.readLine();
            String[] arr = s.split(" ");

            for(int j = 0; j < arr.length; j++){
                stack.push(arr[j]);
            }
            sb.append("Case #" + (i + 1) + ": ");
            for(int j = 0; j < arr.length; j++){
                sb.append(stack.pop()).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}