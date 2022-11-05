package math;
import java.util.Scanner;
public class _10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++){
            score[i] = sc.nextInt();

            if(score[i] < 40){
                score[i] = 40;
            }
            sum += score[i];
        }
        sc.close();

        System.out.println(sum / 5);
    }
}