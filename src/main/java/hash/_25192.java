package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
public class _25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        HashSet<String> set = new HashSet<>();
        while(N --> 0){
            String name = br.readLine();

            if(name.equals("ENTER")){
                set = new HashSet<>();
                continue;
            }
            if(!set.contains(name)){
                set.add(name);
                count++;
            }
        }
        System.out.println(count);
    }
}