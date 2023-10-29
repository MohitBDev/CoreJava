package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		LocalDate D=LocalDate.now();
		System.out.println(D);
		LocalTime T=LocalTime.now();
		System.out.println(T);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		LocalDate d=LocalDate.EPOCH;
		System.out.println(d);
		
		
		
		

	}

}
