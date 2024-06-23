package backjoonBronze.Bronze2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(0);
		list.add(1);
		
		for(int i = 2 ; i <= 20 ; i++) {
			list.add(list.get(i-1)+list.get(i-2));
		}
		System.out.println(list.get(n));
	}
}
