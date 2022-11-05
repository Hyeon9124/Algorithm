package sorting;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class _10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++) {
            arr[i][0] = sc.next();	// 나이
            arr[i][1] = sc.next();	// 이름
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            // 나이순으로 정렬
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });
        for(int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        sc.close();
    }
}