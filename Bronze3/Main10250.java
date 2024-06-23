package backjoonBronze.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T ; i++) {
			List<String> list = new ArrayList<String>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			loop:for(int j = 1 ; j <= W ; j++) {
				for(int k = 1 ; k <= H ; k++) {
					if(list.size()==N) break loop;
					if(j<10) {
						list.add(k+"0"+j);
					}else {
						list.add(k+""+j);
					}
				}
			}
			System.out.println(list.get(list.size()-1));
		}
	}
}
