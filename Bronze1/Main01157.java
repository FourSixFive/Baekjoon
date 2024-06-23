package backjoonBronze.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main01157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		List<Character> list = new ArrayList<>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				list.add(str.charAt(i));
			}else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				list.add((char)(str.charAt(i)-32));
			}
		}
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character c : list) {
			Integer cnt = map.get(c);
			if(cnt == null) {
				map.put(c, 1);
			}else {
				map.put(c, cnt+1);
			}
		}
		
		int max = 0;
		char c = ' ';
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(max < entry.getValue()) {
				max = entry.getValue();
				c = entry.getKey();
			}else if(max == entry.getValue()) {
				c = '?';
			}
		}
		System.out.println(c);
	}
}