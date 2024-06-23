package backjoonBronze.Bronze2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main01977 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = M ; i <= N ; i++) {
			
			if(Math.sqrt(i)%1==0) {
				list.add(i);
			}
		}
		if(list.size()==0) {
			System.out.println(-1);
		}else {
			int sum = 0;
			for(int i = 0 ; i < list.size() ; i++) {
				sum += list.get(i);
			}
			System.out.println(sum+"\n"+list.get(0));
		}
	}
}
