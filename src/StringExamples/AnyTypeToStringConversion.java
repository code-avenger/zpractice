package StringExamples;
import java.math.BigDecimal;
import java.util.Date;

public class AnyTypeToStringConversion {
	public static void main(String[] args) {

		StringBuilder stb=new StringBuilder();
		//		String tab="\t";
		//		
		//		stb.append("id");
		//		stb.append(tab+""+tab+""+tab+""+tab);
		//		
		//		stb.append(tab+"last");
		//		System.out.println(stb);

		BigDecimal bg=null;
		String temp= ((null != bg) ? bg : "").toString();
		System.out.println(temp);

		Integer bg1=null;
		String temp1= String.valueOf((null != bg1) ? bg1 : "");
		System.out.println(temp1);
		
		Boolean bl=null;
		String temp2= String.valueOf((null != bl) ? bl : "");
		System.out.println(temp2);

		Boolean bl2=false;
		String eSigned=(null != bl2) ? (bl2 ? "1" : "0") : "";
		System.out.println("boo "+eSigned);
		
		Long l=new Long(6);
		String temp3= ((null != l) ? l : "").toString();
		System.out.println(temp3);
		
		Date dt=new Date();
		String datesh= ((null != dt) ? dt : "").toString();
		System.out.println(datesh);
		
	int i = 12;
	System.out.println(String.valueOf(i));
		
	}

}