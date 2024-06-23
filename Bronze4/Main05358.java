package backjoonBronze.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05358 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			if(str.isEmpty())break;
			char[] carr = new char[str.length()];
			for(int i = 0 ; i < str.length() ; i++) {
				if(str.charAt(i)=='i') {
					carr[i] = 'e';
				}else if(str.charAt(i)=='e') {
					carr[i] = 'i';
				}else if(str.charAt(i)=='I') {
					carr[i] = 'E';
				}else if(str.charAt(i)=='E') {
					carr[i] = 'I';
				}else {
					carr[i] = str.charAt(i);
				}
			}
			for(int i = 0 ; i < str.length() ; i++) {
				System.out.print(carr[i]);
			}
			System.out.println();
		}
	}
}
