package backjoonSilver.Silver5;

import java.util.Scanner;

public class Main01676 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long fac = 1;
		for(int i = 1 ; i <= N ; i++) {
			String str = fac+"";
			
			for(int j = str.length()-1 ; j >= 0 ; j--) {
				if(str.charAt(j)=='0') {
					if(j>0) {
						str = str.substring(0, j-1);
					}
				}else if(str.charAt(j)!='0') {
					break;
				}
			}
			fac *= i;
		}
		System.out.println(fac);
	}
}
