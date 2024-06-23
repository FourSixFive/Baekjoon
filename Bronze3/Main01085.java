package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main01085 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int [] Arr = new int [4];
		
		Arr[0] = x;
		Arr[1] = y;
		Arr[2] = w-x;
		Arr[3] = h-y;
		int min = x;
		for(int i = 0 ; i<Arr.length ; i++) {
			if(min > Arr[i]) {
				min = Arr[i];
			}
		}
		System.out.println(min);
		*/
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		if(x <= (w-x)) {
			if(y <= (h-y)) {
				System.out.println(x <= y ? x : y);
			} else {
				System.out.println(x >= (h-y) ? (h-y) : x);
			}
		} else {
			if(y <= (h-y)) {
				System.out.println((w-x) <= y ? (w-x) : y);
			} else {
				System.out.println((w-x) <= (h-y) ? (w-x) : (h-y));
			}
		}
		
	}
}
