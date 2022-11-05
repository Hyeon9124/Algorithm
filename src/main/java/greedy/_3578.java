package greedy;
import java.util.Scanner;
public class _3578 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int result = 0;
        String s1 = "8";
        String s2 = "4";

        result += h / 2;

        if(h == 0){
            System.out.println("1");
        }
        else if(h == 1){
            System.out.println("0");
        }
        if(h >= 2){
            if(h % 2 == 0){
                for(int i = 1; i <= result; i++){
                    System.out.print(s1);
                }
            }
            else if(h % 2 == 1){
                System.out.print(s2);
                for(int i = 1; i <= result; i++){
                    System.out.print(s1);
                }
            }
        }
        sc.close();
    }
}