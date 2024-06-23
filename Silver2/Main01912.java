package backjoonSilver.Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main01912 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//수열 리스트에 넣기
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		//DP, 점화식으로 해결
		for(int i = 1 ; i < n ; i++) {
			if(arr[i-1] + arr[i] >= arr[i]) {
				arr[i] = arr[i-1] + arr[i];
			}
		}
		
		//최대값 찾기
		int max = arr[0];
		for(int i = 0 ; i < n ; i++) {
			max = max > arr[i] ? max : arr[i];
		}
		System.out.println(max);
	}
}
