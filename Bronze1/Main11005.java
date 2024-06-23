package backjoonBronze.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main11005 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		List<Integer> listquo = new ArrayList<Integer>();
		List<Integer> listdiv = new ArrayList<Integer>();
		
		listquo.add(N%B);
		listdiv.add(N/B);
		for(int i = 0 ; i<listdiv.size() ; i++) {
			listquo.add(listdiv.get(i)%B);
			listdiv.add(listdiv.get(i)/B);
			if(listdiv.get(i)==0)break;
		}

		listquo.remove(listquo.size()-1);
		
		for(int i = listquo.size()-1 ; i>=0 ; i--) {
			if(listquo.get(i)<10) {
				System.out.print(listquo.get(i));
			}else {
				System.out.print((char)(listquo.get(i)+55));
			}
		}
	}
}
