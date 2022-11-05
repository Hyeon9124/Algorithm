package queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _1966 {
    static int T, N, M, K;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());	// 테스트 케이스

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());	// 문서의 개수
            int M = Integer.parseInt(st.nextToken());	// 몇번째 수인지 나타내는 정수

            int cnt = 0;
            Queue<int[]> q = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                K = Integer.parseInt(st.nextToken());
                q.offer(new int[] {j, K});
            }
            while(!q.isEmpty()) {
                int[] arr = q.poll();
                boolean check = true;

                for(int queue[] : q) {
                    if(queue[1] > arr[1]) {
                        check = false;
                    }
                }
                if(check) {
                    cnt++;
                    if(arr[0] == M) {
                        break;
                    }
                }
                else {
                    q.offer(arr);
                }
            }
            System.out.println(cnt);
        }
    }
}