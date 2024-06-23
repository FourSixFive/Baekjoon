package backjoonBronze.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02490 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0 ; i < 3 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[4];
			
			for(int j = 0 ; j < 4 ; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int yootCnt = 0;
			for(int j = 0 ; j < 4 ; j++) {
				if(arr[j]==1) {
					yootCnt++;
				}
			}
			if(yootCnt == 0) {
				System.out.println('D');
			}else if(yootCnt == 1) {
				System.out.println('C');
			}else if(yootCnt == 2) {
				System.out.println('B');
			}else if(yootCnt == 3) {
				System.out.println('A');
			}else {
				System.out.println('E');
			}
		}
	}
}
