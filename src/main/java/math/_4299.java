package math;
import java.util.Scanner;
public class _4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();   // 점수의 합
        int B = sc.nextInt();   // 점수의 차
        int win = (A + B) / 2;        // 이긴팀의 득점
        int lose = (((A + B) / 2) - B);   // 진 팀의 득점

        if((A + B) % 2 != 0 || A < B){
            System.out.println("-1");
        }
        else {
            System.out.println(win + " " + lose);
        }
        sc.close();
    }
}