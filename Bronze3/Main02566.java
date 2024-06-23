package backjoonBronze.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02566 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int row = 1;
		int column = 1;
		
		for(int i = 1 ; i <= 9 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1 ; j <= 9 ; j++) {
				int a = Integer.parseInt(st.nextToken());
				if(max<a) {
					max=a;
					row=i;
					column=j;
				}
			}
		}
		System.out.print(max+"\n"+row+" "+column);
	}
}
