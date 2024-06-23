package backjoonBronze.Bronze2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main05618 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<Integer>();
		int n = sc.nextInt();
		
		if(n==2) {
			int Num1 = sc.nextInt();
			int Num2 = sc.nextInt();
			
			for(int i = 1 ; i <= Num1 ; i++) {
				if(Num1%i==0) set.add(i);
			}
			for(int i = 1 ; i <= Num2 ; i++) {
				if(Num2%i==0) set.add(i);
			}
			
			List<Integer> list2 = new ArrayList<Integer>(set);
			Collections.sort(list2);
			
			for(int i = 0 ; i<list2.size() ; i++) {
				if(Num1%list2.get(i)==0&&Num2%list2.get(i)==0) {
					System.out.println(list2.get(i));
				}
			}
			
		}else {
			int Num1 = sc.nextInt();
			int Num2 = sc.nextInt();
			int Num3 = sc.nextInt();
			
			for(int i = 1 ; i <= Num1 ; i++) {
				if(Num1%i==0) set.add(i);
			}
			for(int i = 1 ; i <= Num2 ; i++) {
				if(Num2%i==0) set.add(i);
			}
			for(int i = 1 ; i <= Num3 ; i++) {
				if(Num3%i==0) set.add(i);
			}
			
			List<Integer> list2 = new ArrayList<Integer>(set);
			Collections.sort(list2);
			
			for(int i = 0 ; i<list2.size() ; i++) {
				
				if(Num1%list2.get(i)==0&&Num2%list2.get(i)==0&&Num3%list2.get(i)==0) {
					System.out.println(list2.get(i));
				}
			}
		}
	}
}
