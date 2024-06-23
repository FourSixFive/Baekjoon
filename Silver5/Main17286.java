package backjoonSilver.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main17286 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		double sum = 0;
		
		int[][] arr = new int[4][2];
		
		for(int i = 0 ; i < 4 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
			Math.sqrt(Math.pow(arr[i][0], 2)+Math.pow(arr[i][1], 2));
		}
		
		
		
	}
}
