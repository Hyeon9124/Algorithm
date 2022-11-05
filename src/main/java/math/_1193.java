package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int cross_count = 1, prev_count_sum = 0;

        while (true) {

            if (X <= prev_count_sum + cross_count) {

                if (cross_count % 2 == 1) {
                    System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                }

                else {
                    System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }

            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}