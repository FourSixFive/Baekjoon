package backjoonBronze.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main31994 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		
		
		//맵으로 세미나 명과 신청자 수를 저장, 그 중 가장 높은 신청자 수를 max 에 저장
		int max = 0;
		for(int i = 0 ; i < 7 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String semina = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			max = max > num ? max : num;
			map.put(semina, num);
		}
		
		//keySet 으로 value return, 일치하는 key값을 출력
		for(String key : map.keySet()) {
			if(map.get(key) == max) {
				System.out.println(key);
			}
		}
	}
}
