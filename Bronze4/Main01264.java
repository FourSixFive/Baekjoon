package backjoonBronze.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01264 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(;;) {
			String str = br.readLine();
			if(str.equals("#"))break;
			int cnt = 0;
			for(int i = 0 ; i < str.length() ; i++) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'
						||str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
