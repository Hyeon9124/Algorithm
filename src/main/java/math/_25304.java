package math;
import java.util.Scanner;
public class _25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Money = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += (a * b);
        }
        sc.close();

        if(Money == sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}