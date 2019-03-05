package getBytes;


public class GetBytesTest {
	public static void main(String[] args) {
		String text="Aa1!";
		byte[] xByte=text.getBytes();

		for(byte loop: xByte)
		{
			System.out.print(loop+" ");
		}    
	}
}
