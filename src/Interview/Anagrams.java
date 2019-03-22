package Interview;


import java.util.Arrays;
import java.util.Scanner;

public class Anagrams  {

	static boolean isAnagram(String a, String b) {

		String copyOfs1 = a.replaceAll("\\s", "").toLowerCase();
		String copyOfs2 = b.replaceAll("\\s", "").toLowerCase();

		boolean status = true;
		if(copyOfs1.length() != copyOfs2.length())
		{
			status = false;
		}
		else
		{

			char[] s1ToArray = copyOfs1.toCharArray();
			char[] s2ToArray = copyOfs2.toCharArray();
			
			Arrays.sort(s1ToArray);
			Arrays.sort(s2ToArray);
			
			for(int i=0;i<s1ToArray.length;i++) {
				if(s1ToArray[i]!=s2ToArray[i]) {
					status= false;
					break;
				}
			}

			/*for (char c : s1ToArray)
			{
				int index = copyOfs2.indexOf(c);
				if(index != -1)
				{

					copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
				}
				else
				{
					status = false;
					break;
				}
			}*/
		}

		return status;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
