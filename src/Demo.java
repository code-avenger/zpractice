import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) throws IOException {


		//BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String noOfTests = br.readLine();                // Reading input from STDIN
		long nos=Long.valueOf(noOfTests);

		if(1<=nos && nos<=100){
			for(long k=0;k<nos;k++){
				String[] arr=null;

				String input = br.readLine(); 

				arr =input.split("\\s+");

				String one=arr[0];
				String two=arr[1];

				char[] first=one.toCharArray();
				char[] second=two.toCharArray();

				Arrays.sort(first);
				Arrays.sort(second);
				
				if(first.equals(second)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}
			// Write your code here
		}else{
			System.out.println("-1");
		}
	}
}