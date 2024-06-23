package backjoonBronze.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main28702 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < 3 ; i++) {
			String str = br.readLine();
			int n;
			try {
				n = Integer.parseInt(str);
			} catch (Exception e) {
				continue;
			}
			list.add(n);
		}
		
		System.out.println(list);
	}
}
