package backjoonSilver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main03986 {{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for(int i = 0 ; i < N ; i++) {
			
			String str = br.readLine();
			if(str.length()%2==1)continue;
			
			Stack<String> stack = new Stack<>();
		
			for(int j = 0 ; j < str.length() ; j+=2) {
				String duo = str.charAt(j)+""+str.charAt(j+1)+"";
				
				if(duo.equals("AB") || duo.equals("BA")) {
					stack.push(duo);
				}
				if(!stack.isEmpty() && stack.peek().equals("AB") && duo.equals("BA")) {
					stack.pop();
				}else if(!stack.isEmpty() && stack.peek().equals("BA") && duo.equals("AB")) {
					stack.pop();
				}
			}
			if(stack.isEmpty())cnt++;
		}
		System.out.println(cnt);
	}
}
