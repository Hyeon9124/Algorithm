package math;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class _14928 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        long remain = 0; // 자리수를 올려주는 변수

        for(int i = 0; i < N.length(); i++){
            remain = (remain * 10 + (N.charAt(i) - '0')) % 20000303;
        }
        System.out.println(remain);
    }
}