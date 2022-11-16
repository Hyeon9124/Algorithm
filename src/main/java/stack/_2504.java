package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _2504 {
    static Stack<Character> stack = new Stack<>();
    static int sum = 0, cnt = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                cnt *= 2;
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == '[') {
                cnt *= 3;
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty() && s.charAt(i) == ')') {
                if(i >= 1 && s.charAt(i - 1) == '(') {
                    sum += cnt;
                }
                else {
                    if(stack.peek() != '(') {
                        sum = 0;
                        break;
                    }
                }
                cnt /= 2;
                stack.pop();
            }
            else if(!stack.isEmpty() && s.charAt(i) == ']') {
                if(i >= 1 && s.charAt(i - 1) == '[') {
                    sum += cnt;
                }
                else {
                    if(stack.peek() != '[') {
                        sum = 0;
                        break;
                    }
                }
                cnt /= 3;
                stack.pop();
            }
            else {
                sum = 0;
                break;
            }
        }
        if(!stack.isEmpty()) {
            System.out.println(0);
        }
        else {
            System.out.println(sum);
        }
    }
}