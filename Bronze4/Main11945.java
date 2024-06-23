package backjoonBronze.Bronze4;

import java.util.Scanner;

public class Main11945 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0 ; i < a ; i++) {
			String str = sc.nextLine();
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse().toString());
		}
	}
}
