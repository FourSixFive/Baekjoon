package backjoonBronze.Bronze1;

import java.util.Scanner;

public class Main04796 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		while(true) {
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
			if(L==0 && P==0 && V==0)break;
			
			cnt++;
			
			int day = (V / P) * L;
			
			if(V%P < L) {
				System.out.println("Case "+cnt+": "+(day + (V%P)));
			}else {
				System.out.println("Case "+cnt+": "+(day + L));
			}
		}
	}
}
