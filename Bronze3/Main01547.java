package backjoonBronze.Bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class Main01547 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		
		int [] arr = {1, 2, 3};
		
		for(int i = 0 ; i < M ; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int c = arr[x-1];
			arr[x-1] = y;
			arr[y-1] = c;
			System.out.println(Arrays.toString(arr));
		}
	}
}
