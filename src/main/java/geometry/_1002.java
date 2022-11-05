package geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1002 {
    static int x1, x2, y1, y2, r1, r2;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());

            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            if(d == 0 && r1 == r2) {
                System.out.println(-1);
            }
            else if(d > Math.abs(r1 - r2) && d < r1 + r2) {
                System.out.println(2);
            }
            else if(d == r1 + r2 || d == Math.abs(r1 - r2)) {
                System.out.println(1);
            }
            else if(d > r1 + r2 || d < Math.abs(r1 - r2) || d == 0){
                System.out.println(0);
            }
        }
    }
}