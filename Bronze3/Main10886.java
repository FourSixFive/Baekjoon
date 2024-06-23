package backjoonBronze.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10886 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cntYes = 0;
		int cntNo = 0;
		for(int i = 0 ; i < N ; i++) {
			
			int vote = Integer.parseInt(br.readLine());
			if(vote == 1) {
				cntYes++;
			}else {
				cntNo++;
			}
		}
		if(cntYes > cntNo) {
			System.out.println("Junhee is cute!");
		}else {
			System.out.println("Junhee is not cute!");
		}
	}
}
