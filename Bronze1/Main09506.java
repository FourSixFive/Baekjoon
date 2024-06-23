package backjoonBronze.Bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main09506 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==-1)break;
			
			List<Integer> list = new ArrayList<>();
			
			for(int i = 1 ; i < n ; i++) {
				if(n%i==0) {
					list.add(i);
				}
			}
			
			int sum = 0;
			for(int i = 0 ; i < list.size() ; i++) {
				sum += list.get(i);
			}
			if(sum!=n) {
				bw.write(n+" is NOT perfect.\n");
			}else {
				bw.write(n+" = ");
				for(int i = 0 ; i < list.size()-1 ; i++) {
					bw.write(list.get(i)+" + ");
				}
				bw.write(list.get(list.size()-1)+"\n");
			}
			bw.flush();
		}
		bw.close();
	}
}
