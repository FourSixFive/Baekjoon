package backjoonBronze.Bronze5;

import java.util.Scanner;

public class Main10952 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			if(j!=0||k!=0) {
				System.out.println(j+k);
				
			}else if(j==0&&k==0) {
				break;
			}
			
		}
	}
}
