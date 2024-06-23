package backjoonBronze.Bronze4;

import java.util.Scanner;

public class Main15439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int var = 0;
		
		for(int i = 1 ; i <= N ; i++) {
			var=i*(i-1);
		}
		System.out.println(var);
	}
}
