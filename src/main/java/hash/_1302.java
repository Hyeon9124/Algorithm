package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class _1302 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        int max = 0;

        for(int i = 0; i< N; i++){
            String s = br.readLine();
            hm.put(s, hm.getOrDefault(s, 0) + 1);
            max = Math.max(max, hm.get(s));
        }
        List<String> list = new ArrayList<String>();  // 사전 순으로 출력하기 위해 List 배열 사용
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            if(entry.getValue() == max){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list); // 문자열 배열을 오름차순으로 정렬
        System.out.println(list.get(0));  // 정렬한 값에서 0번째 index값을 출력
    }
}
// getOrDefalut() : 찾는 키가 존재하면 해당 키의 값을 반환하고, 없으면 기본값을 반환함.
// Map.Entry는 키와 값 두 가지 요소를 저장하는 튜플이라고 생각할 수 있다.