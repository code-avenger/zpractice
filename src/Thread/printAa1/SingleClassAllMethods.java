package Thread.printAa1;

class PrintData{

	int handShake;
	char capital='A';
	char small='a';
	int no=1;

	public int getHandShake() {
		return handShake;
	}
	public void setHandShake(int handShake) {
		this.handShake = handShake;
	}
	@SuppressWarnings("deprecation")
	public synchronized void printCapital() throws InterruptedException{

		while(this.getHandShake()==1){
			if(capital<='Z'){
				System.out.println(capital++);
				this.setHandShake(2);
				notifyAll();
			}else{
				Thread.currentThread().destroy();
			}
		}
		wait();


	}
	public synchronized void printSmall() throws InterruptedException{
		while(this.getHandShake()==2){
			if(small<='z'){
				System.out.println(small++);
				this.setHandShake(3);
				notifyAll();
			}
			else{
				Thread.currentThread().destroy();
			}
		}
		wait();

	}
	public synchronized void printInt() throws InterruptedException{
		while(this.getHandShake()==3){
			if(no<=26){
				System.out.println(no++);
				this.setHandShake(1);
				notifyAll();
			}else{
				Thread.currentThread().destroy();
			}
		}
		wait();

	}
}


public class SingleClassAllMethods {

	public static void main(String[] args) {
		PrintData pd=new PrintData();
		pd.handShake=1;

		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pd.printCapital();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pd.printSmall();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t3=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pd.printInt();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
