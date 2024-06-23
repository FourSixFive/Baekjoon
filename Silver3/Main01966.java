package backjoonSilver.Silver3;

import java.io.IOException;
import java.util.StringTokenizer;

public class Main01966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String test = "AAAAABBABBABABABBBABAABABBA";
		String token = "AA";
		
		StringTokenizer st = new StringTokenizer(test, token);
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
		}
	}
}
