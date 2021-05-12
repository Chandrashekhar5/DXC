package daytime;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestDate {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		int day=localDate.getDayOfMonth();
		System.out.println(localDate.plusDays(30));
		
		LocalTime time = LocalTime.now();
		System.out.println(time);  
		}

}
