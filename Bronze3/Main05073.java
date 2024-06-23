package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main05073 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			sc.nextLine();
			
			if(A==0 && B==0 && C==0) {
				break;
			}
			
			int max = 0;
			int mid = A;
			int min = 1000;
			
			if(B<C) {
				max = max < C ? C : max;
				min = min > B ? B : min;
			}else if (B>C) {
				max = max < B ? B : max;
				min = min > C ? C : min;
			}
			
			if(max>=mid+min){
			System.out.println("Invalid");
			}else if(A==B && A==C && B==C) {
				System.out.println("Equilateral");
			}else if(A==B || B==C || A==C) {
				System.out.println("Isosceles");
			}else if(A!=B && A!=C && B!=C) {
				System.out.println("Scalene");
			}

		}
	}
}
