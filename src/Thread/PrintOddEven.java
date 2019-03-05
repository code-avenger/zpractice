package Thread;


public class PrintOddEven {

	/** The i. */
	public int i = 1;

	/** The data. */
	public int data = 50;

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		OddEvenPrintData oip = new OddEvenPrintData();

		Thread odd = new Thread(new OddPrinter(oip));
		Thread even = new Thread(new EvenPrinter(oip));

		odd.start();
		even.start();
	}

}

class OddEvenPrintData {
	public int i = 1;
	public int data = 50;

}

class OddPrinter implements Runnable {
	private OddEvenPrintData oip;

	public OddPrinter(OddEvenPrintData oip) {
		this.oip = oip;
	}

	@Override
	public void run() {
		synchronized (oip) {
			for (int i = 1; i <= oip.data; i += 2) {
				while (oip.i != 1) {
					try {
						oip.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd # " + i);
				oip.i = 2;
				oip.notify();
			}
		}
	}
}

class EvenPrinter implements Runnable {
	private OddEvenPrintData oip;

	public EvenPrinter(OddEvenPrintData oip) {
		this.oip = oip;
	}

	@Override
	public void run() {
		synchronized (oip) {
			for (int i = 2; i <= oip.data; i += 2) {
				while (oip.i != 2) {
					try {
						oip.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even # " + i);
				oip.i = 1;
				oip.notify();
			}
		}
	}
}

class printThis {
	int i = 1;
	int j = 2;
	int max = 50;
	char c = 'a';

	public void oddPrint() {
		while (true) {
			if (i < max) {
				synchronized (this) {
					System.out.println(i);
					i += 2;
					notify();
				}
			}
		}
	}

	public void evenPrint() {
		while (true) {
			if (j < max) {
				synchronized (this) {
					System.out.println(j);
					j += 2;
					notify();
				}
			}
		}
	}

	public void alphaPrint() {
		while (true) {
			if (c <= 'z') {
				synchronized (this) {
					System.out.println(c);
					c++;
					notify();
				}
			}
		}
	}

}
