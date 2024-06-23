package backjoonBronze.Bronze2;

import java.util.Scanner;

public class Main02581 {

	public static int isPrime(int n) {
		
		for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
	      if (n % i == 0) {
	          return 0;
	      }
		}
		return n;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		int min = 10000;
		
		for(int i = M ; i <= N ; i++) {
			
			if(i == 1)continue;
			
			if(isPrime(i)!=0) {
				sum += i;
				min = min < i ? min : i;
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum+"\n"+min);
		}
	}
}
