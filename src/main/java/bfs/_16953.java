package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _16953 {
    static int cnt = 1;
    public static int bfs(long A, long B){
        Queue<Long> q = new LinkedList<>();
        q.offer(A);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i < size; i++){
                long tmp = q.poll();

                if(tmp == B){
                    return cnt;
                }
                if(tmp * 2 <= B){
                    q.offer(tmp * 2);
                }
                if(tmp * 10 + 1 <= B){
                    q.offer(tmp * 10 + 1);
                }
            }
            cnt++;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(bfs(A, B));
    }
}