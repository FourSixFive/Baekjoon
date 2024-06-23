package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main02525 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int b = sc.nextInt();
		int rt = (h*60)+m;
		int alarm = rt+b;
		
		if(alarm>=0) {
			if(alarm/60<24) {
				System.out.printf("%d %d",alarm/60,alarm%60);
			}else
				System.out.printf("%d %d",alarm/60-24,alarm%60);
		} else
		System.out.printf("%d %d",alarm/60+23,alarm%60+60);
	}
}
