package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main14215 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		
		int max = 1;
		
		if(A<B) {
			max = B;
			max = max < C ? C : max;
		}else {
			max = A;
			max = max < C ? C : max;
		}
		
		if(A+B+C-max>max) {
			System.out.println(A+B+C);
		}else {
			System.out.println(2*(A+B+C-max)-1);
		}
	}
}
