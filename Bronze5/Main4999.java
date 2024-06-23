package backjoonBronze.Bronze5;

import java.util.Scanner;

public class Main4999 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String pat = sc.nextLine();
		String doc = sc.nextLine();
		
		System.out.println(pat.length() >= doc.length() ? "go" : "no");
	}
}
