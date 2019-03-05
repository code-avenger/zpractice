package Interview;

public class FibonacciSeries {
	public static void main(String[] args) {
		int upto = 500;

		int prevNo = 0;
		int curNo = 1;
		int temp = 0;
		System.out.println(prevNo);
		while (curNo < upto) {
			System.out.println(curNo);
			temp = curNo;
			curNo = prevNo + curNo;

			prevNo = temp;
		}
	}
}
