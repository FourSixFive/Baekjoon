package backjoonBronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main01152 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		System.out.println(list.size());
	}
}
