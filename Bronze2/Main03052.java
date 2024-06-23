package backjoonBronze.Bronze2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main03052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer>set = new TreeSet<Integer>();

		for(int i = 0 ; i < 10 ; i++) {
			set.add(sc.nextInt()%42);
		}
		System.out.println(set.size());
	}
}
