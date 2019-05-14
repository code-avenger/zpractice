package Java8Example.generalJava;

public class DefaultPremitiveValues {
	
	char c;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean b;
	String st;
	
	float[] arr=new float[5];
	
	public static void main(String[] args) {

		DefaultPremitiveValues obj=new DefaultPremitiveValues();
		
		System.out.println(obj.c);
		System.out.println(obj.s);
		System.out.println(obj.i);
		System.out.println(obj.l);
		System.out.println(obj.f);
		System.out.println(obj.d);
		System.out.println(obj.b);
		System.out.println(obj.st);
		
		System.out.println(obj.arr[1]);
		
	}
}
