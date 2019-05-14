package Collections.bigInteger;

import java.math.BigInteger;

public class BigIntegerTest {
	public static void main(String[] args) {
		BigInteger five=new BigInteger("16");
		BigInteger four=new BigInteger("6");
		String newLine = System.getProperty("line.separator");

		System.out.println("add:"+five.add(four));
		System.out.println("subtract:"+five.subtract(four));
		System.out.println("multiply:"+five.multiply(four));
		System.out.println("divide:"+five.divide(four)+newLine);
		
		System.out.println("using divideAndRemainder:");
		//this will return a array of values like below
		System.out.println("divide:"+five.divideAndRemainder(four)[0]);
		System.out.println("reminder:"+five.divideAndRemainder(four)[1]);
	}
}
