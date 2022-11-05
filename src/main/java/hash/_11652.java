package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class _11652 {
    public static void main(String[] args) throws IOException {
        HashMap<Long, Integer> hs = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long L = 0;
        int max = 0;

        for(int i = 0; i < N; i++){
            long card = Long.parseLong(br.readLine());

            hs.put(card, hs.getOrDefault(card, 0) + 1);

            if(hs.get(card) > max){
                max = hs.get(card);
                L = card;
            }
            else if(hs.get(card) == max){
                L = Math.min(L, card);
            }
        }
        System.out.println(L);
    }
}
/*
 * getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없으면 기본 값을 반환하는 메서드
 * getOrDefault(Object Key, V DefaultValue)
 * 매개변수 : 이 메서드는 두 개의 매개 변수를 허용한다.
 * Key : 값을 가져와야 하는 요소의 키이다.
 * defaultValue : 지정된 키로 매핑(mapping)된 값이 없는 경우 반환되어야 하는 기본값입니다.
 * 반환 값 : 찾는 Key가 존재하면 해당 Key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 default 값을 반환한다.
 *
 * mapping : 하나의 값을 다른 값으로 대응시키는 것을 말한다.
 */
// HashMap의 경우 동일 키 값을 추가할 경우 Value의 값이 덮어쓰기가 된다.
// 따라서 기존 Key 값의 Value를 계속 사용하고 싶을 경우 getOrDefault 메서드를 사용한다.