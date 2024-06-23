package backjoonBronze.Bronze4;

import java.util.Scanner;

public class Main05543 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int bmin = a;
		int cmin = x;
		
		if(b<c) {
			bmin = a < c ? a : c;
		}else {
			bmin = a < b ? a : c;
		}
		
		if (x>y) {
			cmin = y;
		}
		System.out.println(bmin+cmin-50);
	}
}
