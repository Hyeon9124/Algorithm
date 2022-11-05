package implementation;
import java.util.Scanner;
public class _11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char s;
        s = sc.nextLine().charAt(0);
        int num1 = (int)s;
        char num2 = (char)s;

        if(num1 > 0)
            System.out.println(num1);
        else
            System.out.println(num2);

        sc.close();
    }
}