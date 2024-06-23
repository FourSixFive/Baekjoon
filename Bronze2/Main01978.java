package backjoonBronze.Bronze2;

import java.util.Scanner;

public class Main01978 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();

		int [] Arr = new int [N];
		int cnt = 0;
		
		for(int i = 0 ; i<N ; i++) {
			Arr[i]=sc.nextInt();
			if(Arr[i]==1){
				continue;
			}
			boolean bool=true;
			
			for (int j = Arr[i]; j >= 2; j--) {
				if (Arr[i] % (j-1) == 0 && j-1 != 1) {
					bool=false;
					break;
				}
			}
			if(bool) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
