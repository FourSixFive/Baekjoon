package backjoonSilver.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main01181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new TreeSet<String>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < N ; i++) {
			set.add(br.readLine());
		}
		String [] sarr = new String [set.size()];
		Iterator<String> itr = set.iterator();
		
		for(int i = 0 ; i<set.size() ; i++) {
			sarr[i] = itr.next();
			if(!itr.hasNext())break;
		}
		Arrays.sort(sarr, (s1, s2) -> s1.length() - s2.length());
		for(int i = 0 ; i<sarr.length ; i++) {
			System.out.println(sarr[i]);
		}
	}
}
