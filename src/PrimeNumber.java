import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) throws IOException {


		List wList=new ArrayList();
		wList.add("1");
		wList.add("6");
		wList.add("7");
		wList.add("0");
		List aList=new ArrayList();
		aList.add("3");
		aList.add("4");
		aList.add("9");
		aList.add("10");
		List mList=new ArrayList();
		mList.add("2");
		mList.add("5");
		mList.add("8");
		mList.add("11");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int tests= Integer.parseInt(input);
		List<Integer> list=new ArrayList<Integer>();

		if(1 <= tests && tests <= Math.pow(10,5)){
			int no = 0;
			for(int i=0;i<tests;i++){

				String st=br.readLine();
				no=Integer.parseInt(st);
				list.add(no);
			}

			for(Integer n:list){
				if(n>=1 && n<=108){

					int mul=n/12;
					int tempSeat = n%12;
					int seat =0;

					if(tempSeat == 0){
						seat=12*(mul-1) +1;
					}else if(tempSeat<=6){
						seat =12*mul +( 12-(tempSeat-1));

					}else{
						seat =12*mul + (6-(tempSeat-7));
					}

					System.out.print(seat+" ");

					if(wList.contains(String.valueOf(tempSeat))){
						System.out.println("WS");
					}else if(aList.contains(String.valueOf(tempSeat))){
						System.out.println("AS");
					}else if(mList.contains(String.valueOf(tempSeat))){
						System.out.println("MS");
					}

				}else{
					System.out.println("-1");
				}
			}
		}

	}

}