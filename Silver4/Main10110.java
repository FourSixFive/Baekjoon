package backjoonSilver.Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10110 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int n15p = (int)Math.round(n*0.15);
		
		
		//배열에 숫자들 삽입
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		
		//정렬 후 15%만큼 앞, 뒤값 초기화
		for(int i = 0 ; i < n15p ; i++) {
			arr[i] = 0;
			arr[arr.length-1-i] = 0;
		}
		
		//입력이 1~30 이므로 전체 개수 - 0 개수 = 평균의 개수
		double sum = 0;
		int zeroCnt = 0;
		for(int i = 0 ; i < arr.length; i++) {
			sum += arr[i];
			if(arr[i]==0) {
				zeroCnt++;
			}
		}
		System.out.println(Math.round(sum/(arr.length-zeroCnt)));
	}
}
