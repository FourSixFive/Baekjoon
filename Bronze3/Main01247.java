package backjoonBronze.Bronze3;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main01247 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; i++) {
			int N = sc.nextInt();
			BigInteger B = BigInteger.ZERO;
			for(int j = 0 ; j < N ; j++) {
				B = B.add(sc.nextBigInteger());
			}
			if(B.compareTo(BigInteger.ZERO)>0) {
				System.out.println('+');
			}else if (B.compareTo(BigInteger.ZERO)<0) {
				System.out.println('-');
			}else {
				System.out.println('0');
			}
		}
	}
}
