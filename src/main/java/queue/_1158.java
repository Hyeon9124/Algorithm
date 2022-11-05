package queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _1158 {
    static Queue<Integer> q = new LinkedList<>();
    static int N, K;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        sb.append("<");

        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while(q.size() != 1) {
            for(int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll() + ", ");
        }
        sb.append(q.poll());
        sb.append(">");

        System.out.println(sb);
    }
}