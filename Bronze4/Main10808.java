package backjoonBronze.Bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main10808 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		int[] arr = new int[26];
		
		for(int i = 0 ; i < S.length() ; i++) {
			arr[S.charAt(i)-97]++;
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			bw.write(arr[i]+" ");
		}
		bw.flush();
		bw.close();
		/*
		String S = br.readLine();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 97 ; i <= 122 ; i++) {
			map.put((char)i, 0);
		}
		
		for(int i = 0 ; i < S.length() ; i++) {
			
			for(Character c : map.keySet()) {
				if(S.charAt(i)==c) {
					map.put(c, map.get(c)+1);
				}
			}
		}
		
		for(int i = 97 ; i <= 122 ; i++) {
			bw.write(map.get((char)i)+" ");
		}
		bw.flush();
		bw.close();
		*/
	}
}
