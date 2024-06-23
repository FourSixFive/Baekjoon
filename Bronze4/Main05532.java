package backjoonBronze.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main05532 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int holidays = Integer.parseInt(br.readLine());
		int korean = Integer.parseInt(br.readLine());
		int math = Integer.parseInt(br.readLine());
		double koreanCnt = Integer.parseInt(br.readLine());
		double mathCnt = Integer.parseInt(br.readLine());
		
		int koreanDate = (int)Math.ceil(korean/koreanCnt);
		int mathDate = (int)Math.ceil(math/mathCnt);
		
		System.out.println(holidays - (koreanDate > mathDate ? koreanDate : mathDate));
	}
}
