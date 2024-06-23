package backjoonBronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main25501 {

	public static int[] recursion(String str, int l, int r, int c){
		
		int cnt = c;
		int [] arr = new int [2];
		
		if(l >= r) {
			arr[0] = 1;
			arr[1] = cnt;
			return arr;
		}else if(str.charAt(l) != str.charAt(r)) {
			arr[0] = 0;
			arr[1] = cnt;
			return arr;
		}else {
			cnt++;
			return recursion(str, l+1, r-1, cnt);
		}
	}

	public static int[] isPalindrome(String str){
		return recursion(str, 0, str.length()-1, 1);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T ; i++) {
			String str = br.readLine();
			System.out.println(isPalindrome(str)[0]+" "+isPalindrome(str)[1]);
		}
	}
}
