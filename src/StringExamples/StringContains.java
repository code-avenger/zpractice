package StringExamples;
import java.util.ArrayList;
import java.util.List;



public class StringContains {
	public static void main(String[] args) {
		List<String> stList=new ArrayList<String>();
		String st="abc";
		stList.add("ABC");
		stList.add("bcf");
		stList.add("sdg");
		stList.add("ase");
		
		if(stList.contains(st.toUpperCase())){
			System.out.println("yes contains");
		}
		else {
			System.out.println("no");
		}
		
	}
}
