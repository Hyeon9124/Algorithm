package math;
import  java.util.Scanner;
public class _2480 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a==b && b==c && c==a) {
            System.out.println(10000 + (a * 1000));
        }
        else if(a==b || b==c || c==a) {
            if(a == b)
                System.out.println(1000 + (a * 100));
            else if(b == c)
                System.out.println(1000 + (b * 100));
            else if(c == a)
                System.out.println(1000 + (c * 100));
        }
        else if(a!=b && b!=c && c!=a) {
            if(a > b && a >c)
                System.out.println((a * 100));
            else if(b > c && b > a)
                System.out.println((b * 100));
            else if(c > a && c > b)
                System.out.println((c * 100));
        }
        sc.close();
    }
}