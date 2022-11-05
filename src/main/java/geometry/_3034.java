package geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _3034 {
    static int N, W, H, find;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            find = Integer.parseInt(br.readLine());

            if(find <= W || find <= H || Math.pow(find, 2) <= Math.pow(W, 2) + Math.pow(H, 2)) {
                System.out.println("DA");
            }
            else {
                System.out.println("NE");
            }
        }
    }
}