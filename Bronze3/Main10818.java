package backjoonBronze.Bronze3;

import java.util.Scanner;

public class Main10818 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[]Arr=new int[num];
		
		for(int i = 0;i<num;i++) {
			Arr[i]=sc.nextInt();
		}
		int max = Arr[0];
        int min = Arr[0];
				
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
            if (Arr[i] < min) {
                min = Arr[i];
            }
        }
        System.out.println(min+" "+max);
	sc.close();
	}
}
