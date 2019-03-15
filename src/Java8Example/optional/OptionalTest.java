package Java8Example.optional;

import java.math.BigInteger;
import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) throws Exception {
		BigInteger five=new BigInteger("5");

		Optional<BigInteger> fiveEp= Optional.empty();
		Optional<BigInteger> fiveOp= Optional.of(five);

		//if else
		BigInteger resultE = fiveEp.map(a -> a).orElseGet(()-> new BigInteger("0"));
		BigInteger resultO = fiveOp.map(a -> a).orElseGet(()-> new BigInteger("0"));

		System.out.println(resultE);
		System.out.println(resultO);

		//only if
		fiveOp.ifPresent(a -> System.out.println(a));

		BigInteger resultException = fiveEp.map(a -> a).orElseThrow(() -> new Exception("else throwing exception"));
	}
}
