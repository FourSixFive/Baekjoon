package backjoonBronze.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10987 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int cnt = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E'
					|| str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O'
					|| str.charAt(i)=='u' || str.charAt(i)=='U') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
