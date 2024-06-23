package backjoonBronze.Bronze5;

import java.util.Scanner;

public class Main10807 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int [] arr = new int[num];
			
			for(int i = 0; i <num ; i++) {
				int a = sc.nextInt();
				arr[i] = a;
			}
			int element = sc.nextInt();
			int cnt = 0;
			for(int i = 0;i<arr.length;i++) {
				if(element==arr[i]) {
					cnt++;
				}
			}System.out.println(cnt);
		
		}
}
