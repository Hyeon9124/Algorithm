package math;
import java.util.Scanner;
public class _15873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = (a / 10) + (a % 10);

        if (a / 10 > 10) {
            num = (a / 100) + (a % 100);
        }

        if (a == 1010) {
            num = 20;
        }
        sc.close();

        System.out.println(num);
    }
}
