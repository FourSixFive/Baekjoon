package backjoonBronze.Bronze3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main02863 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		List<Double> list = new ArrayList<>();
		
		list.add((double) ((A/B) + (C/D)));
		list.add((double) ((C/D) + (A/B)));
		list.add((double) ((D/B) + (C/A)));
		list.add((double) ((B/A) + (D/C)));
		
		double max = 0;
		
		for(int i = 0 ; i < 4 ; i++) {
			
		}
	}
}
