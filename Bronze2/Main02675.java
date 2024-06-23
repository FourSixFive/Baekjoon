package backjoonBronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 0 ; i < T ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			StringBuilder sb = new StringBuilder();
			for(int j = 0 ; j<str.length() ; j++) {
				for(int k = 0 ; k < r ; k++) {
					sb.append(str.charAt(j));
				}
			}
			System.out.println(sb.toString());
		}
	}
}
