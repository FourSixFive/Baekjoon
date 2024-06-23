package backjoonBronze.Bronze2;

import java.util.Scanner;

public class Main05585 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ref = 1000 - sc.nextInt();
		int cnt = 0;
		
		while(true) {
			if(ref<500)break;
			ref = ref - 500;
			cnt++;
		}

		while(true) {
			if(ref<100)break;
			ref = ref - 100;
			cnt++;
		}
		
		while(true) {
			if(ref<50)break;
			ref = ref - 50;
			cnt++;
		}
		
		while(true) {
			if(ref<10)break;
			ref = ref - 10;
			cnt++;
		}
		
		while(true) {
			if(ref<5)break;
			ref = ref - 5;
			cnt++;
		}
		
		while(true) {
			if(ref<1)break;
			ref = ref - 1;
			cnt++;
		}
		System.out.println(cnt);
	}
}
