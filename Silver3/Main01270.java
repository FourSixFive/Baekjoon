package backjoonSilver.Silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main01270 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		//n줄 데이터 입력
		for(int i = 0 ; i < n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int Ti = Integer.parseInt(st.nextToken());

			//부대번호와 수를 map에 등록
			Map<Long, Integer> map = new HashMap<>();
			
			//같은 key일때 카운트 1씩 증가
			for(int j = 0 ; j < Ti ; j++) {
				long soldier = Long.parseLong(st.nextToken());
				Integer cnt = map.get(soldier);
				if(cnt == null) {
					map.put(soldier, 1);
				}else {
					map.put(soldier, cnt+1);
				}
			}
			
			//부대 수를 리스트 삽입 후 과반수 이상일 경우 출력
			List<Long> keySet = new ArrayList<>(map.keySet());
			
			int chk = 0;
			for(Long key : keySet) {
				if((Ti/2)<map.get(key)) {
					chk = 1;
					bw.write(key+"\n");
				}
			}
			if(chk == 0) {
				bw.write("SYJKGW\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
