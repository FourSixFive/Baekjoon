package backjoonBronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15829 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		
		
		//문자열 입력, L 값은 의미가 없는데 문제가 잘못된듯
		String beHash = br.readLine();
		
		
		//고유숫자 : 31, modNumber : 1234567891
		long hash = 0;
		
		for(int i = 0 ; i < beHash.length() ; i++) {
			hash += (long)((beHash.charAt(i)-'`')*Math.pow(31, i));
			if(hash > 1234567891) {
				hash /= 1234567891;
			}
		}
		System.out.println(hash);
	}
}
