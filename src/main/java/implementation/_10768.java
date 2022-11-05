package implementation;
import java.util.Scanner;
public class _10768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        if(month == 2 && day == 18){
            System.out.println("Special");
        }
        else if(month == 2 && day < 18){
            System.out.println("Before");
        }
        else if(month < 2){
            System.out.println("Before");
        }
        else if(month == 2 && day > 18){
            System.out.println("After");
        }
        else if(month > 2){
            System.out.println("After");
        }
        sc.close();
    }
}