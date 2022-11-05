package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _10822 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");

        int sum = 0;
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}