package backjoonBronze.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02965 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int jump = 0;
		
		for(int i = 0 ; i < 100 ; i++) {

			int Left = B-A-1;
			int Right = C-B-1;
			
			if(Left == Right) {
				if(Left == 0) {
					break;
				}else {
					C = B;
					B = A+1;
					jump++;
				}
			}else if(Left > Right) {
				C = B;
				B = A+1;
				jump++;
			}else {
				A = B;
				B = C-1;
				jump++;
			}
		}
		System.out.println(jump);
	}
}
