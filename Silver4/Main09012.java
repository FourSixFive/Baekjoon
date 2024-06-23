package backjoonSilver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main09012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T ; i++) {
			
			String vps = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			int left = 0;
			int right = 0;
			
			for(int j = 0 ; j < vps.length() ; j++) {
			
				if(vps.charAt(j)=='(') {
					stack.add('(');
					left++;
				}else if(vps.charAt(j)==')') {
					right++;
					if(stack.isEmpty()) {
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(stack.isEmpty() && left==right) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
