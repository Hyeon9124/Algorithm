package geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int num1 = Math.abs(x - w);
        int num2 = Math.abs(y - h);
        int[] arr = {x, y, num1, num2};
        int min = arr[0];

        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}