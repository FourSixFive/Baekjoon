package backjoonSilver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); 
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0 ; i < N ; i++) {
			String str = br.readLine();
			String[] arr = str.split(" ");
			
			if(arr[0].equals("push")) {
				stack.push(Integer.parseInt(arr[1]));
			}else if(arr[0].equals("pop")) {
				try {
					System.out.println(stack.pop());
				} catch (Exception e) {
					System.out.println(-1);
				}
			}else if(arr[0].equals("size")) {
				System.out.println(stack.size());
			}else if(arr[0].equals("empty")) {
				if(!stack.empty()) {
					System.out.println(0);
				}else {
					System.out.println(1);
				}
			}else if(arr[0].equals("top")) {
				try {
					System.out.println(stack.peek());
				} catch (Exception e) {
					System.out.println(-1);
				}
			}
		}
	}
}
