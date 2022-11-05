package geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1004 {
    static int x1, y1, x2, y2;
    static int n, x, y, r;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(br.readLine());

            int count = 0;

            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                r = Integer.parseInt(st.nextToken());

                // 출발점과 도착점이 모두 있는 경우
                if(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2) < Math.pow(r, 2) &&
                        Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2) < Math.pow(r, 2)) {
                    continue;
                }
                // 출발점만 행성계 안에 있는 경우 or 도착점만 행성계 안에 있는 경우
                else if(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2) < Math.pow(r, 2) ||
                        Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2) < Math.pow(r, 2)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
// 반례
/*1
0 0 0 50
5
0 0 1
0 0 2
0 0 100
0 50 1
0 50 2
정답: 4
*/