package backjoonSilver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main04949 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("."))break;
			
			Stack<Character> stack = new Stack<>();
			
			for(int i = 0 ; i < str.length() ; i++) {
				
				if(str.charAt(i)=='(') {
					stack.push('(');
				}else if(str.charAt(i)=='[') {
					stack.push('[');
				}

				if(stack.isEmpty() && str.charAt(i)==')') {
					stack.push('F');
				}else if(stack.isEmpty() && str.charAt(i)==']') {
					stack.push('F');
				}
				
				if(!stack.isEmpty() && stack.peek()=='(' && str.charAt(i)==']') {
					stack.push('F');
				}else if(!stack.isEmpty() && stack.peek()=='[' && str.charAt(i)==')') {
					stack.push('F');
				}
				
				if(!stack.isEmpty() && stack.peek()=='(' && str.charAt(i)==')') {
					stack.pop();
				}else if(!stack.isEmpty() && stack.peek()=='[' && str.charAt(i)==']') {
					stack.pop();
				}
			}
			
			System.out.println(stack.isEmpty() ? "yes" : "no");
		}
	}
}
