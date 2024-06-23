package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main02444 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1 ; i <= (2*N)-1 ; i++) {
			if(i<=N) {
				for(int j = 1 ; j<=N-i ; j++) {
					System.out.print(' ');
				}
				for(int j = 1 ; j<=(2*i)-1 ; j++) {
					System.out.print('*');
				}
			}else {
				for(int j = 1 ; j<=i-N ; j++) {
					System.out.print(' ');
				}
				for(int j = 1 ; j<=(4*N-1)-(2*i); j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
}
