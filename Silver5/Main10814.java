package backjoonSilver.Silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] arr = new String [N][3];
		
		for(int i = 0 ; i < N ; i++) {
			String member = br.readLine();
			StringTokenizer st = new StringTokenizer(member);
			
			arr[i][0] = st.nextToken();
			arr[i][1] = member;
			arr[i][2] = i+"";
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			if(Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {
				return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
			}
			return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
		});
		
		for(int i = 0 ; i < N ; i++) {
			bw.write(arr[i][1]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
