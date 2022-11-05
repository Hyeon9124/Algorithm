package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class _1251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        String[] str = new String[3];

        for(int i = 1; i < s.length() - 1; ++i){
            for(int j = i + 1; j < s.length(); ++j){
                str[0] = s.substring(0, i);
                str[1] = s.substring(i, j);
                str[2] = s.substring(j, s.length());

                for(int k = 0; k < 3; k++){
                    for(int l = str[k].length() - 1; l >= 0; --l){
                        sb.append(Character.toString(str[k].charAt(l)));
                    }
                }
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        Collections.sort(list);

        System.out.println(list.get(0));
    }
}