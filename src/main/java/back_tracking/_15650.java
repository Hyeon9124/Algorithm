package back_tracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _15650 {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void dfs(int startNode, int backtracking){
        if(backtracking == M){
            for(int val : arr){
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = startNode; i <= N; i++){
            arr[backtracking] = i;

            // 현재 i 값보다 다음 재귀에서 더 커야하므로 i + 1의 값을 넘겨주고, 깊이 또한 1 증가시켜서 재귀호출 한다.
            /*
            arr 배열에 i가 담김과 동시에 다음 재귀에서는 i값보다 1이 큰 수부터 탐색함과 동시에 backtracking 또한 1증가시키면서
            재귀호출을 해주면 다음 재귀에서 stratNode는 이전 재귀보다 1이 큰 상태가 되고, 반복문에서 결과적으로 이전 값보다
            큰 수부터 탐색하게 된다.
             */
            dfs(i + 1, backtracking + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1,0);

        System.out.println(sb);
    }
}