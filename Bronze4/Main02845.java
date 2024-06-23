package backjoonBronze.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02845 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		StringTokenizer sto = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(sto.nextToken());
		int b = Integer.parseInt(sto.nextToken());
		int c = Integer.parseInt(sto.nextToken());
		int d = Integer.parseInt(sto.nextToken());
		int e = Integer.parseInt(sto.nextToken());
			System.out.print(a - (L*P)+" ");
			System.out.print(b - (L*P)+" ");
			System.out.print(c - (L*P)+" ");
			System.out.print(d - (L*P)+" ");
			System.out.print(e - (L*P));
	}
}
