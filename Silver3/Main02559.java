package backjoonSilver.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main02559 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> today = new ArrayList<>();
		List<Integer> dday = new ArrayList<>();
		
		StringTokenizer sto = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < N ; i++) {
			today.add(Integer.parseInt(sto.nextToken()));
		}
		
		for(int i = 0 ; i <= today.size()-K ; i++) {
			
			int sum = 0;
			
			for(int j = 0 ; j < K ; j++) {
				sum += today.get(i+j);
			}
			dday.add(sum);
		}
		System.out.println(Collections.max(dday));
	}
}
