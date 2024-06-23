package backjoonSilver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main11047 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < N ; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		int cnt = 0;
		for( int i = list.size()-1 ; i >= 0 ; i--) {
			
			while(true) {
				if(K<list.get(i))break;
				K = K - list.get(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
