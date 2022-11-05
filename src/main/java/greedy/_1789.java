package greedy;
import java.util.Scanner;
public class _1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long S = sc.nextLong();
        long sum = 0;
        long count = 0;

        for(int i = 1; ; i++){
            sum += i;
            count++;
            if(sum > S){
                break;
            }
        }
        sc.close();

        System.out.println(count - 1);
    }
}