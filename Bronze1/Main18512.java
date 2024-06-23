package backjoonBronze.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main18512 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int startX = Integer.parseInt(st.nextToken());
		int startY = Integer.parseInt(st.nextToken());
		
		Set<Integer> setX = new HashSet<>();
		
		int range = -1;
		
		for(int i = 0 ; i < 100 ; i++) {
			setX.add(startX+(i*x));
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			if(setX.contains(startY+(i*y))) {
				range = startY+(i*y);
				break;
			}
		}
		System.out.println(range);
	}
}
