package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main02903 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long dot = 0;
		
		for(int i = 0 ; i < N+1 ; i++) {
			dot=(long) ((Math.pow(2, i)+1)*(Math.pow(2, i)+1));
		}
		System.out.println(dot);
	}
}
