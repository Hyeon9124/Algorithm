package queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
public class _11279 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer num1, Integer num2){
                if(Math.abs(num1) > Math.abs(num2)){
                    // 절대값 기준으로 num1이 더 크면 자리를 바꿔준다.
                    return Math.abs(num1) - Math.abs(num2);
                }
                else if(Math.abs(num1) == Math.abs(num2)){
                    // 절대값 기준으로 num1 == num2 이면 음수를 앞으로 보낸다.
                    return num1 - num2;
                }
                else{
                    return -1;
                }
            }
        });
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(!queue.isEmpty()){
                    System.out.println(queue.poll());
                }
                else{
                    System.out.println("0");
                }
            }
            else{
                queue.add(num);
            }
        }
    }
}