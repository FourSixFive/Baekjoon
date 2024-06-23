package backjoonSilver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();

		for(int i = 0 ; i < K ; i++) {
			
			int a = Integer.parseInt(br.readLine());
			if(a!=0) {
				stack.add(a);
			}else if(a==0) {
				stack.pop();
			}
		}
		int sum = 0;
		for(int i = 0 ; i < stack.size() ; i++) {
			sum += stack.get(i);
		}
		System.out.println(sum);
	}
}
