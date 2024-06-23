package backjoonSilver.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main05046 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int men = Integer.parseInt(st.nextToken());
		int budget = Integer.parseInt(st.nextToken());
		int hotel = Integer.parseInt(st.nextToken());
		int weekend = Integer.parseInt(st.nextToken());
		
		int[] bookedCnt = new int[weekend];
		
		int price = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < hotel ; i++) {
			StringTokenizer sto = new StringTokenizer(br.readLine());
			bookedCnt[i] = Integer.parseInt(sto.nextToken());
		}
		
		Ctrl + D
	}
}
