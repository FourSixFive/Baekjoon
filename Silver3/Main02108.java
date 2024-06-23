package backjoonSilver.Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main02108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();

		double avg = 0;
		int middle = 0;
		int range = 0;
		for(int i = 0 ; i < N ; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		for(int i = 0 ; i < list.size() ; i++) {
			avg += list.get(i);
		}
		
		Collections.sort(list);
		middle = list.get((int)(Math.floor(list.size()/2)));
		range = list.get(list.size()-1)-list.get(0);
		
		Map<Integer, Integer> map = new HashMap<>();
				
		for(Integer c : list) {
			Integer cnt = map.get(c);
			if(cnt == null) {
				map.put(c, 1);
			}else {
				map.put(c, cnt+1);
			}
		}
		
		int[][] arr = new int[map.size()][2];
		int idx = 0;
		for (int i : map.keySet()) {
			arr[idx][0] = i;
			arr[idx][1] = map.get(i);
			idx++;
		}
		Arrays.sort(arr, (o1, o2) -> {
			if (o2[1] == o1[1]) {
				return o1[0] - o2[0];
			}
			return o2[1] - o1[1];
		});
		
		int freq = 0;
		
		if(arr.length==1) {
			freq = arr[0][0];
		}else if(arr[0][1]==arr[1][1]) {
			freq = arr[1][0];
		}else if(arr[0][1]!=arr[1][1]){
			freq = arr[0][0];
		}
		
		System.out.println(Math.round(avg/list.size()));
		System.out.println(middle);
		System.out.println(freq);
		System.out.println(range);
	}
}
