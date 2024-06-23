package backjoonBronze.Bronze3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main04153 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(a==0 && b==0 && c==0)break;
			
			int max = a;
			
			if(b < c) {
				max = max > c ? max : c;
			}else if(b > c) {
				max = max > b ? max : b;
			}
			
			if(max == a) {
				if(Math.pow(a, 2) == (Math.pow(b, 2)+Math.pow(c, 2))) {
					bw.write("right\n");
				}else {
					bw.write("wrong\n");
				}
			}else if(max == b) {
				if(Math.pow(b, 2) == (Math.pow(a, 2)+Math.pow(c, 2))) {
					bw.write("right\n");
				}else {
					bw.write("wrong\n");
				}
			}else if(max == c) {
				if(Math.pow(c, 2) == (Math.pow(a, 2)+Math.pow(b, 2))) {
					bw.write("right\n");
				}else {
					bw.write("wrong\n");
				}
			}
			bw.flush();
		}
		bw.close();
	}
}
