package backjoonBronze.Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main29731 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] rick = { "Never gonna give you up", "Never gonna let you down",
				          "Never gonna run around and desert you", "Never gonna make you cry", "Never gonna say goodbye",
			              "Never gonna tell a lie and hurt you", "Never gonna stop" };

		String result = "No";

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String hacker = br.readLine();

			boolean ishacked = true;

			for (int j = 0; j < 7; j++) {
				if (hacker.equals(rick[j])) {
					ishacked = false;
				}
			}
			if(ishacked) {
				result = "Yes";
			}
		}
		System.out.println(result);
	}
}
