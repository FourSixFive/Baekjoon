package backjoonBronze.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main09063 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] Arr = new int [2*N];
		
		for(int i = 0 ; i<2*N ; i+=2) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Arr[i] = Integer.parseInt(st.nextToken());
			Arr[i+1] = Integer.parseInt(st.nextToken());
		}
		
		int xminArr = Arr[0];
		int yminArr = Arr[1];
		int xmaxArr = Arr[0];
		int ymaxArr = Arr[1];
		
		for(int i = 1 ; i<=Arr.length ; i++) {
			if(i%2==1) {
				xminArr = xminArr>Arr[i-1]?Arr[i-1]:xminArr;
				xmaxArr = xmaxArr<Arr[i-1]?Arr[i-1]:xmaxArr;
			}else if(i%2==0) {
				yminArr = yminArr>Arr[i-1]?Arr[i-1]:yminArr;
				ymaxArr = ymaxArr<Arr[i-1]?Arr[i-1]:ymaxArr;
			}
		}

		System.out.println((xmaxArr-xminArr)*(ymaxArr-yminArr));
	}
}
