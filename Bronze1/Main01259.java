package backjoonBronze.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01259 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0"))break;
			boolean bool = true;
			int j = 0;

			for(int i = 0 ; i < str.length()/2 ; i++) {
				if(str.charAt(i)==str.charAt(str.length()-1-j)) {
					j++;
				}else {
					bool = false;
					break;
				}
			}
			if(bool) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}
}
