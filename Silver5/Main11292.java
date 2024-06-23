package backjoonSilver.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main11292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N == 0)break;
			
			double max = 0;
			
			//맵에 이름과 키(height) 저장
			Map<String, Double> map = new LinkedHashMap<>();
			for(int i = 0 ; i < N ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				double height = Double.parseDouble(st.nextToken());
				max = max > height ? max : height;
				map.put(name, height);
			}
			
			
			//키셋을 기준으로 람다정렬
			List<String> keySet = new ArrayList<>(map.keySet());
			
			keySet.sort(new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return map.get(o1).compareTo(map.get(o2));
				}
			});
			keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
			
			
			//키값이 가장 높은 값을 출력
			for(String key : keySet) {
				if(max==map.get(key)) {
					System.out.print(key+" ");
				}
			}
			System.out.println();
		}
	}
}
