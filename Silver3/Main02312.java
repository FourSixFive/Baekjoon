package backjoonSilver.Silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main02312 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		//t줄의 숫자들 입력
		for(int i = 0 ; i < t ; i++) {
			
			int N = Integer.parseInt(br.readLine());
			Map<Integer, Integer> map = new HashMap<>();
			List<Integer> list = new ArrayList<>();
			
			
			//2 부터 인수분해, N값 갱신
			for(int j = 2 ; j <= Math.sqrt(N) ; j++) {
				while(N%j == 0) {
					list.add(j);
					N /= j;
				}
			}
			if(N != 1) {
				list.add(N);
			}

			
			//중복된 수 카운트로 횟수체크
			for(Integer n : list) {
				Integer cnt = map.get(n);
				if(cnt == null) {
					map.put(n, 1);
				}else {
					map.put(n, cnt+1);
				}
			}
			
			
			//map key값 정렬
			List<Integer> keySet = new ArrayList<>(map.keySet());

	        Collections.sort(keySet);
	        for(Integer key : keySet) {
	        	bw.write(key+" "+map.get(key)+"\n");
	        }
		}
		bw.flush();
		bw.close();
	}
}
