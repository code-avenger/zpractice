package Thread;

public class ThreadPriorityAndName {
	public static void main(String[] args) throws InterruptedException {


		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);

		Thread t1=new Thread(new Test());
		Thread t2=new Thread(new Test());

		t1.start();
		t2.start();
		
		System.out.println(t1.getState());
		
		t1.join();
		System.out.println(t1.getState());
	}
}

class Test implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());	
		System.out.println(Thread.currentThread().getPriority());
		
	}

}