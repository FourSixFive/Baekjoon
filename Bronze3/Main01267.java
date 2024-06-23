package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main01267 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int yphone = 0;
		int mphone = 0;
		
		for(int i = 0 ; i < T ; i++) {
			
			double phone = sc.nextDouble();

			if(phone%30==0) {
				phone = phone+1;
			}
			
			yphone += (int)Math.ceil(phone/30)*10;
			mphone += (int)Math.ceil(phone/60)*15;
		}
		
		if(yphone < mphone) {
			System.out.println("Y "+yphone);
		}else if(yphone > mphone) {
			System.out.println("M "+mphone);
		}else if(yphone==mphone) {
			System.out.println("Y M "+mphone);
		}
	}
}
