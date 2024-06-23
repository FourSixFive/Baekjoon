package backjoonBronze.Bronze2;

import java.util.Scanner;

public class Main02920 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int [] iarr = new int [8];
		
		for(int i = 0 ; i < iarr.length ; i++) {
			iarr[i]=sc.nextInt();
		}
		
		if(iarr[0]+1==iarr[1] && iarr[1]+1==iarr[2] && iarr[2]+1==iarr[3] && iarr[3]+1==iarr[4]
				&& iarr[4]+1==iarr[5] && iarr[5]+1==iarr[6] && iarr[6]+1==iarr[7]) {
			System.out.println("ascending");
		}else if (iarr[0]-1==iarr[1] && iarr[1]-1==iarr[2] && iarr[2]-1==iarr[3] && iarr[3]-1==iarr[4]
				&& iarr[4]-1==iarr[5] && iarr[5]-1==iarr[6] && iarr[6]-1==iarr[7]) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}
