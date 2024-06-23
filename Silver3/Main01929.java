package backjoonSilver.Silver3;

import java.util.Scanner;

public class Main01929 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		for(int i = A ; i <= B ; i++) {
			
			if(i==1)continue;
			
			Boolean bool = true;
			
			for(int j = 2 ; j <= Math.sqrt(i) ; j++) {
				if(i%j == 0) {
					bool = false;
					break;
				}
			}
			if(bool) {
				System.out.println(i);
			}
		}
	}
}
