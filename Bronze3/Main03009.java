package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main03009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] Arr = new int [6];
		
		for(int i = 0 ; i<Arr.length ; i++) {
			Arr[i] = sc.nextInt();
		}
		if(Arr[0]==Arr[2]) {
			System.out.print(Arr[4]+" ");
		}
		if(Arr[0]==Arr[4]) {
			System.out.print(Arr[2]+" ");
		}
		if(Arr[2]==Arr[4]) {
			System.out.print(Arr[0]+" ");
		}
		if(Arr[1]==Arr[3]) {
			System.out.print(Arr[5]);
		}
		if(Arr[1]==Arr[5]) {
			System.out.print(Arr[3]);
		}
		if(Arr[3]==Arr[5]) {
			System.out.print(Arr[1]);
		}
	}
}
