package backjoonSilver.Silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new ArrayDeque<>();
		
		for(int i = 0 ; i < N ; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch (str) {
			case "push_front":
				dq.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				dq.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if(dq.peekFirst()==null) {
					bw.write(-1+"\n");
				}else {
					bw.write(dq.pollFirst()+"\n");
				}
				break;
			case "pop_back":
				if(dq.peekLast()==null) {
					bw.write(-1+"\n");
				}else {
					bw.write(dq.pollLast()+"\n");
				}
				break;
			case "size":
				bw.write(dq.size()+"\n");
				break;
			case "empty":
				if(dq.isEmpty()) {
					bw.write(1+"\n");
				}else {
					bw.write(0+"\n");
				}
				break;
			case "front":
				if(dq.peekFirst()==null) {
					bw.write(-1+"\n");
				}else {
					bw.write(dq.peekFirst()+"\n");
				}
				break;
			case "back":
				if(dq.peekLast()==null) {
					bw.write(-1+"\n");
				}else {
					bw.write(dq.peekLast()+"\n");
				}
				break;
			}
			bw.flush();
		}
		bw.close();
	}
}
