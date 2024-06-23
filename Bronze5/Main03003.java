package backjoonBronze.Bronze5;

import java.util.Scanner;

public class Main03003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] iarr = new int [6];
		
		for(int i = 0 ; i<6 ; i++) {
			iarr[i] = sc.nextInt();
		}
	
		if(iarr[0]!=1) {
			iarr[0] = 1-iarr[0];
		}else {
			iarr[0] = 0;
		}
		if(iarr[1]!=1) {
			iarr[1] = 1-iarr[1];
		}else {
			iarr[1] = 0;
		}
		if(iarr[2]!=2) {
			iarr[2] = 2-iarr[2];
		}else {
			iarr[2] = 0;
		}
		if(iarr[3]!=2) {
			iarr[3] = 2-iarr[3];
		}else {
			iarr[3] = 0;
		}
		if(iarr[4]!=2) {
			iarr[4] = 2-iarr[4];
		}else {
			iarr[4] = 0;
		}
		if(iarr[5]!=8) {
			iarr[5] = 8-iarr[5];
		}else {
			iarr[5] = 0;
		}
		for(int i = 0 ; i<6 ; i++) {
			System.out.print(iarr[i]+" ");
		}
	}
}
