package greedy;
import java.util.Scanner;
public class _4796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;

        for(int i = 0; i >= 0; i++){
            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();
            count++;
            if(L == 0 && P == 0 && V == 0){
                break;
            }
            else {
                total = (((V / P) * L) + Math.min((V % P), L));
                System.out.println("Case " + count + ": " + total);
            }
        }
        sc.close();
    }
}
/*
 * 3 8 20
 * 6일 캠핑장 쓰고 휴가 4일 남음 캠핑장 이용가능 횟수 3일
 */