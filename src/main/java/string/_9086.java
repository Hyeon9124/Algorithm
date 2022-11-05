package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _9086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String s = br.readLine();
            String[] str = s.split("", s.length());
            if(s.length() == 1) {
                System.out.println(str[0] + str[0]);
            }
            else if(s.length() > 1) {
                System.out.println(str[0] + str[s.length() - 1]);
            }
        }
    }
}