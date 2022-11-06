package implementation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class _25915 { // 2022 연세대학교 프로그래밍 경진대회 Open Contest
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "ILOVEYONSEI";
        int num = br.readLine().charAt(0) - 64;
        int sum = Math.abs(str.charAt(0) - 64 - num);

        for(int i = 1; i < str.length(); i++){
            sum += Math.abs((str.charAt(i) - 64) - (str.charAt(i - 1) - 64));
        }
        br.close();

        System.out.println(sum);
    }
}