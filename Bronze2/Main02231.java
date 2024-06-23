package backjoonBronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main02231 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		
		int chk = 0;
		
		for(int i = 1 ; i <= 1000000 ; i++) {
			
			List<Integer> list = new ArrayList<>();
			String str = i+"";
			
			for(int j = 0 ; j < str.length() ; j++) {
				list.add((int)(str.charAt(j))-'0');
			}
			
			int sum = 0;
			
			for(int j = 0 ; j < list.size() ; j++) {
				sum += list.get(j);
			}
			if(i+sum==num) {
				chk = i;
				break;
			}
		}
		System.out.println(chk);
	}
}
