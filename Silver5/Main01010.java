package backjoonSilver.Silver5;

import java.util.Scanner;

public class Main01010 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int cnt = 0;
		
		for(int i = 1 ; i <= T ; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			for(;;) {
				int j = 1;
				if(M-j>=N) {
					cnt++;
					j++;
				}else {
					break;
				}
			}
		System.out.println(cnt);
		cnt = 0;
		}
	}
}
