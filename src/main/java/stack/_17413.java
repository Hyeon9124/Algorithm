package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class _17413 {
    static Stack<Character> stack = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        boolean check = false;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '<'){
                check = true;   // 태그 안에 있을 때
                while(!stack.isEmpty()){  // 스택에 저장되어 있는 값을 pop하면서 출력
                    System.out.print(stack.pop());
                }
                System.out.print(s.charAt(i));  // '<' 출력
            }
            else if(s.charAt(i) == '>'){  // '>' 오면 출력
                check = false;
                System.out.print(s.charAt(i));
            }
            else if(check){ // '<>' 안에 있으면 출력
                System.out.print(s.charAt(i));
            }
            else if(!check){
                if(s.charAt(i) == ' '){
                    while(!stack.isEmpty()){  // 스택에 저장되어 있는 값을 pop하면서 출력
                        System.out.print(stack.pop());
                    }
                    System.out.print(s.charAt(i));
                }
                else{   // ' '이 아니면 스택에 push
                    stack.push(s.charAt(i));
                }
            }
        }
        while(!stack.isEmpty()){  // 저장되어 있는 stack값을 pop하면서 출력
            System.out.print(stack.pop());
        }
    }
}