package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main02562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			max = arr[i] > max ? arr[i] : max;
		}

		System.out.println(max);
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}

