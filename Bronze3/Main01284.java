package backjoonBronze.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01284 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String N = br.readLine();
			
			if(N.equals("0"))break;
			
			int sum = 0;

			for(int i = 0 ; i < N.length() ; i++) {
				
				if(N.charAt(i)=='1') {
					sum += 2;
				}else if(N.charAt(i)=='0') {
					sum += 4;
				}else {
					sum += 3;
				}
			}
			sum += N.length()+1;
			System.out.println(sum);
		}
	}
}
