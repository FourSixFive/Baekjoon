package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main02576 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] oddArr = new int [7];
		int sum = 0;
		int min = 101;
		
		for(int i = 0 ; i < 7 ; i++) {
			oddArr[i]=sc.nextInt();
			if(oddArr[i]%2==1) {
				sum+=oddArr[i];
				min = (oddArr[i] < min) ? oddArr[i] : min;
			}
		}
		if(sum==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum + "\n" + min);
		}
	}
}
