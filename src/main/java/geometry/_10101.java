package geometry;
import java.util.Scanner;
public class _10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = 0;
        sum = A + B + C;

        if(A == 60 && B == 60 && C == 60){
            System.out.println("Equilateral");
        }
        else if(sum != 180){
            System.out.println("Error");
        }
        else if(sum == 180 && A == B || B == C || C == A){
            System.out.println("Isosceles");
        }
        else if(sum == 180 && A != B || B != C || C != A){
            System.out.println("Scalene");
        }
        sc.close();
    }
}