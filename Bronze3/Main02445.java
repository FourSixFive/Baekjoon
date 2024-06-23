package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main02445 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1 ; i <= 2*N-1 ; i++) {
			if(i<=N) {
				for(int j = 0 ; j < i ; j++) {
					System.out.print('*');
				}
				for(int j = 0 ; j < (2*N)-(2*i) ; j++) {
					System.out.print(' ');
				}
				for(int j = 0 ; j < i ; j++) {
					System.out.print('*');
				}
			}else {
				for(int j = 0 ; j < (2*N)-i ; j++) {
					System.out.print('*');
				}
				for(int j = 0 ; j < (2*i)-(2*N) ; j++) {
					System.out.print(' ');
				}
				for(int j = 0 ; j < (2*N)-i ; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
}
