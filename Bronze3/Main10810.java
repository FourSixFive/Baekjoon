package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main10810 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] arr = new int [N];
		
		for(int i = 0 ; i < M; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			for(int j = a ; j<=b ;j++) {
				arr[j-1]=c;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
