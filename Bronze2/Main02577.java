package backjoonBronze.Bronze2;

import java.util.Scanner;

public class Main02577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		String str = A*B*C+"";
		
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;

		for(int i = 0 ; i < str.length() ; i++) {
			int cnt = (int)str.charAt(i)-'0';
			switch (cnt) {
			case 0:
				zero++;
				break;
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			case 6:
				six++;
				break;
			case 7:
				seven++;
				break;
			case 8:
				eight++;
				break;
			case 9:
				nine++;
				break;
			}
		}
		System.out.println(zero+"\n"+one+"\n"+two+"\n"+three+"\n"+four+"\n"+five+"\n"+six+"\n"+seven+"\n"+eight+"\n"+nine);
	}
}
