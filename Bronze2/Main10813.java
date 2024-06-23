package backjoonBronze.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10813 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [] arr = new int[N];
		int t = 0;
		
		for(int i = 1 ; i<=N ; i++) {
			arr[i-1]=i;
		}
		
		for(int i = 1 ; i<=M ; i++) {
			StringTokenizer sto = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(sto.nextToken());
			int b = Integer.parseInt(sto.nextToken());
			t=arr[a-1];
			arr[a-1]=arr[b-1];
			arr[b-1]=t;
		}
		
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
