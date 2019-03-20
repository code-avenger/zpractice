import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BurnCalories {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int tests=scan.nextInt();

		for(int i=0;i<tests;i++) {
			List<BigInteger> list=new ArrayList<>();

			int items=scan.nextInt();
			BigInteger prev=new BigInteger("0");
			BigInteger result=new BigInteger("0");
			BigInteger two=new BigInteger("2");

			for(int j=0;j<items;j++) {
				int temp=scan.nextInt();
				list.add(new BigInteger(String.valueOf(temp)));
			}

			Collections.sort(list);

			System.out.println(list);

			for(int k=items-1;k>=0;k--) {
				result=result.add(((two.multiply(prev)).add(list.get(k))));
				prev=prev.add(list.get(k));

			}

			System.out.println(result);

		}
	}

}
