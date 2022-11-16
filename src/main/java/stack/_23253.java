package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
public class _23253 {  // 스택 어거지로 써서 맞음.. 사실 안써도 됨. 내림차순 되는 것만 찾으면 됨.
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean check = true;

        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(br.readLine());
            int min = 200_001;
            int[] arr = new int[num];

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < num; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                stack.push(arr[j]);
                if(arr[j] > min){
                    check = false;
                    stack.pop();
                }
                min = arr[j];
            }
        }
        if(check){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}