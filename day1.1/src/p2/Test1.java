package p2;
import static p2.Printer.SPEED;

public class Test1 {

	public static void main(String[] args) {
		//direct ref.
		ConsolePrinter printer=new ConsolePrinter();
		printer.print("mesg1");
		//can non imple class accese i/f constant?yes(but using i/f Name.constantName)
 System.out.println(SPEED);
	}

}
