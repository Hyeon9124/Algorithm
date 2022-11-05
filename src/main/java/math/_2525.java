package math;
import java.util.Scanner;
public class _2525{
    public static void main(String[] args) {
        int H, M, C, sum;
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();
        C = sc.nextInt();
        sum = M + C;
        int n = sum / 60;

        if(sum / 60 >= 1) {
            H += n;
            sum -= (60 * n);
        }
        else if(sum % 60 == 0) {
            H++;
            sum = 0;
        }
        else if(sum > 60) {
            H++;
            sum -= 60;
        }

        if(H == 24)
            H = 0;
        else if(H < 0)
            H += 24;
        else if(H > 24)
            H -= 24;

        sc.close();
        System.out.println(H + " " + sum);
    }
}