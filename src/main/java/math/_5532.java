package math;
import java.util.Scanner;
public class _5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();   // 방학일 수
        int A = sc.nextInt();   // 국어
        int B = sc.nextInt();   // 수학
        int C = sc.nextInt();   // 하루에 국어 최대 페이지
        int D = sc.nextInt();   // 하루에 수학 최대 페이지

        int day1 = A / C;
        int day2 = B / D;

        if(A % C != 0){
            day1++;
        }
        if(B % D != 0){
            day2++;
        }

        if(day1 > day2){
            System.out.println(L - day1);
        }
        else if(day1 <= day2){
            System.out.println(L - day2);
        }
        sc.close();
    }
}