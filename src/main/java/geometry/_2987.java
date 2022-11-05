package geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _2987 {
    static int ccw(int x1, int y1, int x2, int y2, int x3, int y3){
        return (x1 * y2 + x2 * y3 + x3 * y1) - (y1 * x2 + y2 * x3 + y3 * x1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][] arr = new int[3][2];
        int sum = 0;

        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        sum = Math.abs(ccw(arr[0][0], arr[0][1], arr[1][0], arr[1][1], arr[2][0], arr[2][1]));

        sb.append((sum / 2.0) + "\n");

        int N = Integer.parseInt(br.readLine());

        int[] ans = new int[3];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            ans[0] = ccw(arr[0][0], arr[0][1], arr[1][0], arr[1][1], x, y);
            ans[1] = ccw(arr[1][0], arr[1][1], arr[2][0], arr[2][1], x, y);
            ans[2] = ccw(arr[2][0], arr[2][1], arr[0][0], arr[0][1], x, y);

            if(ans[0] <= 0 && ans[1] <= 0 && ans[2] <= 0){
                cnt++;
            }
            else if(ans[0] >= 0 && ans[1] >= 0 && ans[2] >= 0){
                cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}