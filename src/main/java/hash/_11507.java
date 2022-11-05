package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
public class _11507 {
    static HashSet<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] arr = new int[4];

        for(int i = 0; i < s.length(); i += 3){
            String str = s.substring(i, i + 3);
            if(set.contains(str)){
                System.out.println("GRESKA");
                return;
            }
            set.add(str);

            switch(str.charAt(0)){
                case 'P' :
                    arr[0]++;
                    break;

                case 'K' :
                    arr[1]++;
                    break;

                case 'H' :
                    arr[2]++;
                    break;

                case 'T' :
                    arr[3]++;
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 4; i++){
            sb.append(13 - arr[i]).append(' ');
        }
        System.out.println(sb);
    }
}