package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _1550 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int c = Integer.valueOf(s, 16);

        System.out.println(c);
    }
}