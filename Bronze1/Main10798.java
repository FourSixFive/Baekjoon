package backjoonBronze.Bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main10798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<String> list = new ArrayList<>();
		for(int i = 0 ; i < 5 ; i++) {
			String str = br.readLine();
			list.add(str);
		}
		
		int listidx = 0;
		int stridx = 0;
		while(true) {
			
			if(listidx >= list.size())break;
			
			if(list.get(listidx).length() > stridx) {
				bw.write(list.get(listidx).charAt(stridx)+"");
				listidx++;
			}else {
				listidx++;
			}
			
			if(listidx == 4) {
				stridx++;
				listidx = 0;
			}
		}
		bw.flush();
		bw.close();
	}
}
