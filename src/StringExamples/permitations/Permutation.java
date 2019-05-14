package StringExamples.permitations;

// Java program to print all permutations of a 
// given string. 
public class Permutation 
{ 
	public int counter=0;
	public static void main(String[] args) 
	{ 
		String str = "ABC"; 
		int n = str.length(); 
		Permutation permutation = new Permutation(); 
		permutation.permute(str, 0, n-1); 
		System.out.println("total: "+permutation.counter);
	} 

	/** 
	 * permutation function 
	 * @param str string to calculate permutation for 
	 * @param start starting index 
	 * @param end end index 
	 */
	private void permute(String str, int start, int end) 
	{ 
		if (start == end) {
			counter++;
			System.out.println(str); 
		}else{ 
			for (int i = start; i <= end; i++) 
			{ 
				str = swap(str,start,i); 
				permute(str, start+1, end); 
				str = swap(str,start,i); 
			} 
		} 
	} 

	/** 
	 * Swap Characters at position 
	 * @param str string value 
	 * @param first position 1 
	 * @param second position 2 
	 * @return swapped string 
	 */
	public String swap(String str, int first, int second) 
	{ 
		char temp; 
		char[] charArray = str.toCharArray(); 
		temp = charArray[first] ; 
		charArray[first] = charArray[second]; 
		charArray[second] = temp; 
		return String.valueOf(charArray); 
	} 

} 