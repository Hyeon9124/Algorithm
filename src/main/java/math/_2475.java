package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _2475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        int a3 = Integer.parseInt(st.nextToken());
        int a4 = Integer.parseInt(st.nextToken());
        int a5 = Integer.parseInt(st.nextToken());

        int sum = 0;
        sum = ((a1 * a1) + (a2 * a2) + (a3 * a3) + (a4 * a4) + (a5 * a5));

        System.out.println(sum % 10);
    }
}