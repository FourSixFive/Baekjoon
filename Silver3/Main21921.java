package backjoonSilver.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main21921 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		List<Integer>list = new ArrayList<Integer>();
		int [] iarr = new int [(int) Math.ceil(N/X)];
		
		for(int i = 0 ; i < N ; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		for(int i = 0 ; i < N ; i+=X) {
			
		}
		
	}
}
