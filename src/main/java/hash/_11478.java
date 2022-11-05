package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
public class _11478 {
    public static void main(String[] args) throws IOException{
        HashSet<String> hs = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++){
            String str = "";
            for(int j = i; j < s.length(); j++){
                str += s.substring(j, j + 1);
                hs.add(str);
            }
        }
        System.out.println(hs.size());
    }
}
// substring은 문자열을 원하는 위치에서 자를때 쓰임.
/*
 * 예) String str = "0123456789";
 *     0 ~ 4까지를 제외한 56789를 가져오고 싶을 때 아래와 같이 호출
 *     str.substirng(5)     index값이 5인 위치 이후 값을 가져 오라고 했으므로 56789를 return한다.
 *
 *     Stirng str = "000003565120";
 *     System.out.println(str.substring(6, 13));
 *     System.out.println(str.substring(6));
 *     -> 두 개의 출력 값은 서로 같음.
 */