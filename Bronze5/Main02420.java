package backjoonBronze.Bronze5;

import java.util.Scanner;

public class Main02420 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		if(N<M) {
			System.out.println(M-N);
		}else {
			System.out.println(N-M);
		}
	}
}
