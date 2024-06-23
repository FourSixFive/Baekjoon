package backjoonBronze.Bronze5;

import java.util.Scanner;

public class Main15727 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		System.out.println(t%5==0 ? t/5 : (t/5)+1);
	}
}
