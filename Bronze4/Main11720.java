package backjoonBronze.Bronze4;

import java.util.Scanner;

public class Main11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String str = sc.next();
		
		int[]nArr = new int[N];
		int sum = 0;
		
		for(int i = 0 ; i < nArr.length ; i++) {
			nArr[i]=str.charAt(i)-48;
			sum += nArr[i];
		}
		System.out.println(sum);
	}
}
