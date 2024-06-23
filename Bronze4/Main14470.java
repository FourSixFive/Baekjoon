package backjoonBronze.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14470 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int meat = Integer.parseInt(br.readLine());
		int goal = Integer.parseInt(br.readLine());
		int under = Integer.parseInt(br.readLine());
		int meltdown = Integer.parseInt(br.readLine());
		int up = Integer.parseInt(br.readLine());
		
		int timer = 0;
		
		while(meat<0) {
			timer += under;
			meat++;
		}
		if(meat==0) {
			timer += meltdown;
		}
		while(meat<goal) {
			timer += up;
			meat++;
		}
		System.out.println(timer);
	}
}
