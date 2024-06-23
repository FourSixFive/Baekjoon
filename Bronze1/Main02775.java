package backjoonBronze.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02775 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		// 파스칼의 삼각형 만들기
		int[][] pascal = new int[14][];
		
		// 호실은 1씩 증가하므로 count로 지정
		int cnt = 1;
		for (int i = 0; i < 14; i++) {

			pascal[i] = new int[i + 1];

			pascal[i][0] = 1;
			pascal[i][i] = cnt;

			// 중간에 위치한 숫자는 이전 행의 왼쪽에 있는 숫자와 바로 위에 있는 숫자의 합
			for (int j = 1; j < i; j++) {
				pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
			}
			cnt++;
		}
		*/
		
		//아파트 만들기
		int[][] apartment = new int[15][15];
		
		int cnt = 1;
		for(int j = 0 ; j < 15 ; j++) {
			apartment[0][j] = cnt;
			cnt++;
		}

		for(int i = 1 ; i <= 14 ; i++) {

			apartment[i][0] = 1;
			
			for(int j = 1 ; j <= 14 ; j++) {
				apartment[i][j] = apartment[i-1][j]+apartment[i][j-1];
			}
		}
		
		
		//특정 위치 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < T ; i++) {
			int floor = Integer.parseInt(br.readLine());
			int blocks = Integer.parseInt(br.readLine());
			
			System.out.println(apartment[floor][blocks-1]);
		}
	}
}
