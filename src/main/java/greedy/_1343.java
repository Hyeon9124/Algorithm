package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _1343 {
    public static String poliomino(String s) {
        String str = "";
        String A = "AAAA";
        String B = "BB";

        s = s.replaceAll("XXXX", A);
        str = s.replaceAll("XX", B);

        if (str.contains("X")) {
            str = "-1";
        }
        return str;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(poliomino(s));
    }
}
// replaceAll() : 대상 문자열을 원하는 문자 값으로 변환하는 함수이다.
// 첫번째 매개변수는 변환하고자 하는 대상이 될 문자열
// 두번째 매개변수는 변환할 문자 값