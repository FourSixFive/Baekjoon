package backjoonSilver.Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main01308 {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String startDay = br.readLine();
		String endDay = br.readLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		
		Date start = sdf.parse(startDay);
		Date end = sdf.parse(endDay);
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(start);
		int startYear = cal.get(Calendar.YEAR);
		int startMonth = cal.get(Calendar.MONTH);
		int startDate = cal.get(Calendar.DATE);
		
		cal.setTime(end);
		int endYear = cal.get(Calendar.YEAR);
		int endMonth = cal.get(Calendar.MONTH);
		int endDate = cal.get(Calendar.DATE);
		
		long difference = (end.getTime() - start.getTime())/86400000L;
		
		if(endYear - startYear > 1000) {
			System.out.println("gg");
		}else if(endYear - startYear == 1000) {
			if(endMonth > startMonth) {
				System.out.println("gg");
			}else if(endMonth == startMonth){
				if(endDate >= startDate) {
					System.out.println("gg");
				}else {
					System.out.println("D-"+difference);
				}
			}else {
				System.out.println("D-"+difference);
			}
		}else {
			System.out.println("D-"+difference);
		}
	}
}
