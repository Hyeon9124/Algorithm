package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class _20291 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            String file = s.substring(s.indexOf(".") + 1);

            map.put(file, map.getOrDefault(file, 0) + 1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for(String result : list){
            System.out.println(result + " " + map.get(result));
        }
    }
}