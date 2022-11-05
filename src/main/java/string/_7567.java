package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _7567 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 10;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count += 5;
            }
            else{
                count += 10;
            }
        }
        System.out.println(count);
    }
}