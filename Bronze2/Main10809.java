package backjoonBronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		List<Character> list = new ArrayList<>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			list.add(str.charAt(i));
		}
		
		for(int i = 97 ; i <= 122 ; i++) {
			System.out.print(list.indexOf((char)i)+" ");
		}
	}
}
