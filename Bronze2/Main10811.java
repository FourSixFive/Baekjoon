package backjoonBronze.Bronze2;

import java.io.IOException;
import java.util.Scanner;

public class Main10811 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 1 ; i <= N ; i++) {
			arr[i-1] = i;
		}
		for(int i = 0 ; i < M ; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			for(int j = a ; j <= b ; j++) {
				int tmp = arr[b];
				arr[b] = arr[j];
				arr[j] = tmp;
				b--;
			}
		}
		for(int i = 0 ; i < N ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
