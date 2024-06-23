package backjoonBronze.Bronze5;

import java.util.Scanner;

public class Main29699 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = "WelcomeToSMUPC";
		
		if(N%14==0){
			System.out.println(str.charAt(13));
		}else {
			System.out.println(str.charAt(N%14-1));
		}
	}
}
