package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _10799 {
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
                continue;
            }
            if (s.charAt(i) == ')') {
                stack.pop(); // 일단 stack에서 pop을 실행.
                if (s.charAt(i - 1) == '(') { // 그 전 괄호가 열린 괄호면 레이저를 의미.
                    count += stack.size(); // 현재 stack의 사이즈만큼 더해 줌.
                } else {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}