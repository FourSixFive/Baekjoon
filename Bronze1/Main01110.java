package backjoonBronze.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main01110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String dummy = input;
		String newinput = "";
		
		if(input.length()==1) {
			input = "0"+input;
		}
		int cnt = 0;
		while(true) {
			cnt++;
			
			if(dummy.length() == 1) {
				dummy = "0"+dummy;
			}
			
			int front = dummy.charAt(0)-'0';
			int rear = dummy.charAt(dummy.length()-1)-'0';
			String sum = (front+rear)+"";
			
			if(sum.length() == 1) {
				sum = "0"+sum;
			}
			
			char newRight = (sum).charAt((sum).length()-1);

			newinput = rear+""+newRight+"";
			
			if(input.equals(newinput)) {
				break;
			}else {
				dummy = newinput;
			}
		}
		System.out.println(cnt);
	}
}
