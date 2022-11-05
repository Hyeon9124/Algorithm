package queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class _2161 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }
        sb.append(q.remove() + " ");

        while(true) {
            if(q.size() == 0) {
                break;
            }
            q.offer(q.poll());
            sb.append(q.remove() + " ");
        }
        System.out.println(sb);
    }
}