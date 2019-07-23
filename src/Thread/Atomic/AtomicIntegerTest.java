package Thread.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

	public static void main(String[] args) {

		AtomicInteger temp=new AtomicInteger(10);
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {

				temp.set(14);

			}
		});
		
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {

				temp.set(16);

			}
		});
		
		t2.start();
		System.out.println(temp);
		t1.start();
		
		
		
		try {
			t1.join();
			t2.join();
			
			System.out.println(temp);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
}
