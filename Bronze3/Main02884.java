package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main02884 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int rt = (h*60)+m;
		int alarm = rt-45;
		
		if(alarm>=0) {
		System.out.printf("%d %d",alarm/60,alarm%60);
		} else
		System.out.printf("%d %d",alarm/60+23,alarm%60+60);
		
	}
}
