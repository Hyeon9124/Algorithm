package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class _10546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
            // N명의 마라토너의 이름이 없으면 이름, 값을 1추가, 이미 있으면 값을 1 더해준다.
        }
        for(int j = 0; j < N - 1; j++){
            String finish = br.readLine();
            if(map.get(finish) == 1){  // map에 저장되어 있는 마라토너이 값이 1이면 remove
                map.remove(finish);
            }
            else{  // 만약 값이 2이상이면 1을 빼준 값으르 업데이트 한다.
                map.put(finish, map.get(finish) - 1);
            }
        }
        for(String result : map.keySet()){
            System.out.println(result);
        }
    }
}