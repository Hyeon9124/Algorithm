package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _26264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'b'){
                cnt1++;
                str.charAt(i + 6);
            }
            else if(str.charAt(i) == 's'){
                cnt2++;
                str.charAt(i + 7);
            }
        }
        if(cnt1 > cnt2) System.out.println("bigdata?");
        else if(cnt1 < cnt2) System.out.println("security!");
        else System.out.println("bigdata? security!");
    }
}