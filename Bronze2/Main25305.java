package backjoonBronze.Bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main25305 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		
		StringTokenizer sto = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < N ; i++) {
			list.add(Integer.parseInt(sto.nextToken()));
		}
		
		Collections.sort(list, Comparator.reverseOrder());
		
		bw.write(list.get(k-1)+"");
		bw.flush();
		bw.close();
	}
}
