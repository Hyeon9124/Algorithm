package queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> dq = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for(int i = 1; i <= N; i++){
            dq.add(i);  // 1부터 N까지 입력
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int K = Integer.parseInt(st.nextToken());

            while(dq.getFirst() != K){  // K값이 맨 앞에 올때까지 반복
                if(dq.indexOf(K) <= dq.size() / 2){
                    dq.addLast(dq.getFirst());
                    dq.removeFirst();
                }
                else{
                    dq.addFirst(dq.getLast());
                    dq.removeLast();
                }
                cnt++;
            }
            if(dq.getFirst() == K){ // K값이 맨 앞에 위치하면 그 값을 제외
                dq.removeFirst();
            }
        }
        System.out.println(cnt);
    }
}