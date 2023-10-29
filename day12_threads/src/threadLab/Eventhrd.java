package threadLab;

import java.util.stream.IntStream;

public class Eventhrd implements Runnable {
	
	private int start;
	private int end;

	public Eventhrd(int start, int end) {
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
			IntStream.range(start, end).filter(i->i%2==0).forEach(s->System.out.println(Thread.currentThread().getName() +s));
			
		}
		catch(Exception e)
		{
			System.out.println(Thread.currentThread().getName()+ "executing" +e);
			
		}
		System.out.println(Thread.currentThread().getName()+ "Over" );
	}
	
	
}
