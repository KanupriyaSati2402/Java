package AbstractionJava;

public abstract class Abs5 {

	Abs5(){
		
	}
	
//	abstract public void m();
	// variable 
	static int a =5;
	int b=5;
	
	//method 
	public static void m1() {
		System.out.println("hy");
	}
	public void m2() {
		System.out.println("hii");
	}
	
	//single line initializer 
	static int c=8;
	int d=4;
	
	//multiline 
	
	static {
		System.out.println("heloooooooo");
	}
	{
		System.out.println("hey!");
	}
	
	
	
}
