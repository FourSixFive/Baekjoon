package backjoonBronze.Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main29731_v2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> rick = new ArrayList<String>();
		
		rick.add("Never gonna give you up");
		rick.add("Never gonna let you down");
		rick.add("Never gonna run around and desert you");
		rick.add("Never gonna make you cry");
		rick.add("Never gonna say goodbye");
		rick.add("Never gonna tell a lie and hurt you");
		rick.add("Never gonna stop");
		
		String str = "No";
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<N ; i++) {
			String hacker = br.readLine();
			if(!rick.contains(hacker)) {
				str = "Yes";
			}
		}
		System.out.println(str);
	}
}
