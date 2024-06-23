package backjoonBronze.Bronze5;

import java.util.Scanner;

public class Main02744 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String str2 = "";
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i)>=65&&str.charAt(i)<=90) {
				str2+=(char)(str.charAt(i)+32);
			}
			if(str.charAt(i)>=97&&str.charAt(i)<=122) {
				str2+=(char)(str.charAt(i)-32);
			}
		}
		System.out.println(str2);
	}
}
