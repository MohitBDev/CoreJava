package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedTextFileReadFP {

	public static void main(String[] args) {
		System.out.println("Enter file name/ path ");
		try (Scanner sc = new Scanner(System.in);
				// Java App <---- BR <--- FR <--- text file
			//	PrintWriter pw =new PrintWriter(new FileWriter(sc.next()))
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
                // chain of i/o : success
			System.out.println("Enter Keyword to search :");
			String str=sc.next();
		//	br.lines().filter();
			br.lines().filter(s->s.contains(str)).map(s->s.concat(s.substring(0,1).toUpperCase()+s.substring(1))).forEach(s->System.out.println(s));
		//	br.lines().forEach(s-> System.out.println(s));
		//	br.lines().sorted().forEach(s-> System.out.println(s));
			
	System.out.println("File reading complete!!!!!");

		}  //JVM : br.close() , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
