package geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1358 {
    static int W, H, X, Y, P, x1, y1;
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        W = Integer.parseInt(st.nextToken()); 	// 정사각형 가로 길이
        H = Integer.parseInt(st.nextToken());	// 정사각형 높이
        X = Integer.parseInt(st.nextToken());	// x좌표
        Y = Integer.parseInt(st.nextToken());	// y좌표
        P = Integer.parseInt(st.nextToken());	// testcase

        for(int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());

            int c1 = (int) (Math.pow((x1 - X), 2) + Math.pow((y1 - (Y + (H / 2))), 2));
            int c2 = (int) (Math.pow((x1 - (X + W)), 2) + Math.pow((y1 - (Y + (H / 2))), 2));

            if(c1 <= (int) Math.pow((H / 2), 2) || c2 <= (int) Math.pow((H / 2), 2)
                    || x1 >= X && x1 <= W + X && y1 >= Y && y1 <= H + Y) {
                count++;
            }
        }
        System.out.println(count);
    }
}