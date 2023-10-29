package thrds2;
import static java.lang.Thread.*;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main thrd details "+ Thread.currentThread());// Thread [main,5,main]
		//create runnable task instance
		MyRunableTask task=new MyRunableTask();
//		Thread t0=new Thread();
//		t0.start();
		// create child thrds
		//Thread(Runnable instance ,String Name)
		Thread t1=new Thread(task,"one");
		Thread t2=new Thread(task,"two");
		Thread t3=new Thread(task,"three");
		Thread t4=new Thread(task,"four");//How many runnable thrds ? 1
		t1.start();
		//t1.start();// if exception comes main thread stops 
		t2.start();// 
		t3.start();
		t4.start();// RUNNABLE : 1(parent)+4(child)
		
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + " exec # " + i);
			sleep(200);
		//	t1.start();
		}
		System.out.println("main sending iterrup to t1");
		t1.interrupt();
		System.out.println("t1 Status "+t1.isAlive());
		
		//t1.start();// t1 is dead can't be started again by main
		t1.join();//main:blocked on join (i.e main waiting to complete t1 execution)
		t2.join();
	    t3.join();
	    t4.join();
	    
		System.out.println("main over......");

	}

}
