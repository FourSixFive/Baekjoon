package backjoonBronze.Bronze5;

import java.util.Scanner;

public class Main04101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 && b==0)break;
			
			if(a<=b) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
		
	}
}
