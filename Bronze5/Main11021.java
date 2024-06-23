package backjoonBronze.Bronze5;

import java.util.Scanner;

public class Main11021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%d: %d\n",i+1,a+b);
		}
	}
}
