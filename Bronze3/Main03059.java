package backjoonBronze.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main03059 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T ; i++) {
			String str = br.readLine();
			Set<Character> set = new HashSet<>();
			
			for(int j = 0 ; j < str.length() ; j++) {
				set.add(str.charAt(j));
			}
			
			int sum = 0;
			Iterator<Character> itr = set.iterator();
			while(itr.hasNext()) {
				sum += itr.next();
			}
			System.out.println(2015-sum);
		}
	}
}
