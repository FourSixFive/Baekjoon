package backjoonBronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main29716 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int J = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int i = 0 ; i < N ; i++) {
			String str = br.readLine();
			
			int sum = 0;
			for(int j = 0 ; j < str.length() ; j++) {
				if(str.charAt(j)==' ') {
					sum += 1;
				}else if(str.charAt(j) >= 65 && str.charAt(j) <= 90) {
					sum += 4;
				}else if(str.charAt(j) >= 97 && str.charAt(j) <= 122) {
					sum += 2;
				}else if(str.charAt(j) >= 48 && str.charAt(j) <= 57) {
					sum += 2;
				}
			}
			
			if(sum <= J) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
