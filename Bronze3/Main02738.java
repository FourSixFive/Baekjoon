package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main02738 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] nArr = new int[N*M];
		int [] mArr = new int[N*M];
		
		for(int i = 0; i<N*M; i++) {
			nArr[i]=sc.nextInt();
		}
		for(int i = 0; i<N*M; i++) {
			mArr[i]=sc.nextInt();
		}
		for(int i = 0; i<N*M; i+=M) {
			for(int j = 0;j<M; j++) {
				System.out.print(nArr[i+j]+mArr[i+j]+" ");
			}
			System.out.println();
		}
		
		
		/*
		int [][] nArr = new int [N][M];
		int [][] mArr = new int [N][M];
		
		for(int i = 0; i<N;i++) {
			for(int j = 0; j<M;j++) {
				nArr[i][j]=sc.nextInt();
			}
		}
		for(int i = 0; i<N;i++) {
			for(int j = 0; j<M;j++) {
				mArr[i][j]=sc.nextInt();
			}
		}
		for(int i = 0; i<N;i++) {
			for(int j = 0 ; j<M;j++) {
				System.out.print(nArr[i][j]+mArr[i][j]+" ");
			}
			System.out.println();
		}
		*/
	}
}
