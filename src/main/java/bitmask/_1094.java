package bitmask;
import java.util.Scanner;
public class _1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int stick = 64;
        int count = 0;

        while(X > 0){
            if(stick > X){
                stick /= 2;
            }
            else{
                count++;
                X -= stick;
            }
        }
        sc.close();

        System.out.println(count);
    }
}