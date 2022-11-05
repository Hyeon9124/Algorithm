package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int result = y;

        for(int i = 0; i < x - 1; i++){ // month 만큼 더하면서 마지막에 7로 나눈 나머지 수가 day가 됨
            result += month[i];
        }
        System.out.println(day[result % 7]);
    }
}