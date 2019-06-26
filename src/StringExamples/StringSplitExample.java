package StringExamples;

public class StringSplitExample {
	public static void main(String[] args) {
		String st="asd sde ksd : ase: kce:wedf:      1";

        String[] arraySet = st.split(" ");

		for(String item:arraySet){
			System.out.println(item);
		}

		char c=st.charAt(4);
		System.out.println("******** "+c);
	}
}
