package backjoonBronze.Bronze4;

import java.util.Scanner;

public class Main14652 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		int x = 0;
		int y = 0;
		
		loop:for(int i = 0 ; i<N ; i++) {
				for(int j = 0 ; j<M ; j++) {
					cnt++;
					x = i;
					y = j;
					if(cnt-1==K)break loop;
				}
			}
		System.out.println(x+" "+y);
	}
}
