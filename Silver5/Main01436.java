package backjoonSilver.Silver5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main01436 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		List<String> list = new ArrayList<>();
		
		for(int i = 1 ; i <= i+1 ; i++) {
			String str = i+"";
			if(str.contains("666")) {
				list.add(str);
			}
			if(list.size()==N)break;
		}
		System.out.println(list.get(N-1));
	}
}
