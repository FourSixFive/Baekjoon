package backjoonBronze.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main05597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer>list = new ArrayList<Integer>();
		List<Integer>Num = new ArrayList<Integer>();
		
		for(int i = 1 ; i<=28 ; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		for(int i = 1 ; i<=30 ; i++) {
			if(!list.contains(i)) {
				Num.add(i);
			}
		}

		if(Num.get(0)<Num.get(1)) {
			System.out.print(Num.get(0)+"\n"+Num.get(1));
		}else {
			System.out.print(Num.get(1)+"\n"+Num.get(0));
		}
	}
}
