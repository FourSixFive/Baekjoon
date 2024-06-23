package backjoonBronze.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main05596 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sumS = 0;
		int sumT = 0;
		for(int i = 0 ; i < 4 ; i++) {
			sumS += Integer.parseInt(st.nextToken());
		}
		
		StringTokenizer sto = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < 4 ; i++) {
			sumT += Integer.parseInt(sto.nextToken());
		}
		if(sumS==sumT) {
			System.out.println(sumS);
		}else {
			System.out.println(sumS > sumT ? sumS : sumT);
		}
	}
}
