package stack;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
public class _9093 {
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String s = br.readLine() + "\n";
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == ' ' || s.charAt(j) == '\n'){
                    while(!stack.isEmpty()){
                        bw.write(stack.pop());
                    }
                    bw.write(" ");
                }
                else{
                    stack.push(s.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}