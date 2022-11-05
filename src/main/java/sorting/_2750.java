package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class _2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
/*
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class _2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Integer[] arr = new Integer[N];

		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		Arrays.sort(arr, Collections.reverseOrder());

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
*/