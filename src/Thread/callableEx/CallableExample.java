package Thread.callableEx;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableExample {

	public static void main(String[] args)
	{
		ExecutorService executor =  Executors.newFixedThreadPool(2);

		List<Future<Integer>> resultList = new ArrayList<>();

		for (int i=0; i<4; i++)
		{
			FactorialCalculator calculator  = new FactorialCalculator(i);
			Future<Integer> result = executor.submit(calculator);
			resultList.add(result);
		}

		for(Future<Integer> future : resultList)
		{
			try
			{
				System.out.println("Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
			}
			catch (InterruptedException | ExecutionException e)
			{
				e.printStackTrace();
			}
		}
		//shut down the executor service now
		executor.shutdown();
	}
}

class FactorialCalculator implements Callable<Integer>
{

	private Integer number;

	public FactorialCalculator(Integer number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		
		int result = 1;
		
		if ((number == 0) || (number == 1)) {
			result = 1;
		} else {
			for (int i = 2; i <= number; i++) {
				result *= i;
				TimeUnit.MILLISECONDS.sleep(20);
			}
		}
		System.out.println("Result for number - " + number + " -> " + result);
		return result;
	}
}
