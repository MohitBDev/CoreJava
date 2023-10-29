package DateTime;

import java.util.Scanner;
import static java.time.LocalDate.*;
import static java.time.LocalTime.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test2 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println(LocalDate.now());
			LocalDate d=LocalDate.now();
			System.out.println("Enter Date dd-MM-yyyy :");
			System.out.println(LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd-MM-yyyy")));
			
			
			
		}

	}

}
