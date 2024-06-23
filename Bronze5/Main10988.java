package backjoonBronze.Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int cnt = 1;
		
		for(int i = 0 ; i < str.length()/2 ; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				cnt=0;
			}
		}
		System.out.println(cnt);
	}
}
