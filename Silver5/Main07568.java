package backjoonSilver.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main07568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<int[]> list = new ArrayList<>();
		
		
		//list 입력값 저장
		for(int i = 0 ; i < N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
			list.add(arr);
		}
		
		
	}
}
