package backjoonBronze.Bronze4;

import java.util.Scanner;

public class Main24723 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int way = 0;
		
		for (int i = 1 ; i<=N ; i++) {
			way=(int)(Math.pow(2, i));
		}
		System.out.println(way);
	}
}
