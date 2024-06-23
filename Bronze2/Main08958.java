package backjoonBronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main08958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < t ; i++) {
			String ox = br.readLine();
			int cnt = 0;
			int total = 0;
			for(int j = 0 ; j < ox.length() ; j++) {
				if(ox.charAt(j)=='O') {
					cnt++;
				}else if(ox.charAt(j)=='X') {
					cnt = 0;
				}
				total = total + cnt;
			}
			System.out.println(total);
		}
	}
}
