package backjoonBronze.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main01546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] iarr = new int [N];
		int max = 0;
		for(int i = 0 ; i < N ; i++) {
			iarr[i] = Integer.parseInt(st.nextToken());
			if(max < iarr[i]) {
				max = iarr[i];
			}
		}
		double [] iarr2 = new double [N];
		for(int i = 0 ; i < N ; i++) {
			iarr2[i] = (double)iarr[i]/max*100;
		}
		double sum = 0;
		for(int i = 0 ; i < N ; i++) {
			sum += iarr2[i];
		}
		System.out.println(sum/N);
	}
}
