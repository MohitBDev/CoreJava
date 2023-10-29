package threadLab;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AveragerThrd implements Runnable{

	
	private int start;
	private int end;
	

	public AveragerThrd(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		System.out.println("constr invoked "+Thread.currentThread().getName());
	
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ "Started" );
		try {
			 //IntStream().range().filter().forEach();
			double average = IntStream.range(start, end).average().orElseThrow();
			System.out.println(average);
		}
		catch(Exception e)
		{
			System.out.println(Thread.currentThread().getName()+ "executing" +e);
			
		}
		System.out.println(Thread.currentThread().getName()+ "Over" );
	}
	
	

}
