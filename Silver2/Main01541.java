package backjoonSilver.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main01541 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String front = "";
		String rear = "";
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i)=='-') {
				front = str.substring(0,i);
				rear = str.substring(i+1,str.length());
				break;
			}else if(!str.contains("-")){
				rear = str;
			}
		}
		
		StringTokenizer st = new StringTokenizer(front,"-+");
		
		List<Integer> list = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int sum = 0;
		for(int i : list) {
			sum += i;
		}
		
		StringTokenizer st2 = new StringTokenizer(rear,"-+");
		
		List<Integer> list2 = new ArrayList<>();
		
		while(st2.hasMoreTokens()) {
			list2.add(Integer.parseInt(st2.nextToken()));
		}
		
		int sum2 = 0;
		for(int i : list2) {
			sum2 += i;
		}
		if(front.equals("")) {
			System.out.println(sum2);
		}else if(!front.equals("")) {
			System.out.println(sum-sum2);
		}
	}
}
