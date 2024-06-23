package backjoonSilver.Silver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main02178 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] table = new int[N][N];
		int[][] tablesum = new int[N][N];
		
		//입력, (N by N)표 배열 등록
		
		int sum = 0;
		for(int i = 0 ; i < N ; i++) {
			
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			
			for(int j = 0 ; j < N ; j++) {
				int atom = Integer.parseInt(st1.nextToken());
				table[i][j] = atom;
				sum += atom;
				tablesum[i][j] = sum;
			}
		}
		
		for(int i = 0 ; i < M ; i++) {
			
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			int startX = Integer.parseInt(st2.nextToken())-1;
			int startY = Integer.parseInt(st2.nextToken())-1;
			int endX = Integer.parseInt(st2.nextToken())-1;
			int endY = Integer.parseInt(st2.nextToken())-1;
			
			int answer = tablesum[endX][endY];
			
			Ctrl + D
		}
	}
}
