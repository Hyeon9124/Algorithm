package sorting;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]){ // 첫번째 원소가 같으면 두번째 원소 비교
                return e1[1] - e2[1];
            }
            else{
                return e1[0] - e2[0];
            }
        });
        for(int i = 0; i < N; i++){
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }
        System.out.println(sb);
    }
}