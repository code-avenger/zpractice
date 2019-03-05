package Thread.printAa1;

public class PrintAa1 {
	public static void main(String[] args) {

		DataForPrint data = new DataForPrint();
		Thread pc = new Thread(new PrintCapital(data));
		Thread ps = new Thread(new PrintSmall(data));
		Thread pn = new Thread(new PrintNo(data));

		pc.start();
		ps.start();
		pn.start();


	}
}
class DataForPrint {
	char capital = 'A';
	char small = 'a';
	int no = 1;
	int index = 1;
}

class PrintCapital implements Runnable {

	DataForPrint dForPrint;

	PrintCapital(DataForPrint dForPrint) {
		this.dForPrint = dForPrint;
	}

	@Override
	public void run() {
		synchronized (dForPrint) {
			System.out.println("index " + dForPrint.index);
			while (dForPrint.index == 1) {
				System.out.println(dForPrint.capital++);

				dForPrint.index = 2;
				dForPrint.notifyAll();

			}

			try {
				dForPrint.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

	}

}

class PrintSmall implements Runnable {

	DataForPrint dForPrint;

	PrintSmall(DataForPrint dForPrint) {
		this.dForPrint = dForPrint;
	}

	@Override
	public void run() {
		synchronized (dForPrint) {
			System.out.println("index " + dForPrint.index);
			while (dForPrint.index == 2) {
				System.out.println(dForPrint.small++);
				dForPrint.index = 3;
				dForPrint.notifyAll();
			}

			try {
				dForPrint.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class PrintNo implements Runnable {

	DataForPrint dForPrint;

	PrintNo(DataForPrint dForPrint) {
		this.dForPrint = dForPrint;
	}

	@Override
	public void run() {
		synchronized (dForPrint) {
			System.out.println("index " + dForPrint.index);
			while (dForPrint.index == 3) {
				System.out.println(dForPrint.no++);
				dForPrint.index = 1;
				dForPrint.notifyAll();
			}

			try {
				dForPrint.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
