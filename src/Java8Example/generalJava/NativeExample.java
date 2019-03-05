package Java8Example.generalJava;

class TestNative{
	static 
	{ 
		System.loadLibrary("Native library path"); 
	} 
	public native void m(); 
}

public class NativeExample extends TestNative{
	public static void main(String[] args) 
	{ 
		TestNative n = new TestNative(); 
		n.m(); 
	} 
}
