package AbstractionJava;

public class abst1 extends abst2{

	public void m() {
		System.out.println("hello");
	}
	public static void main (String [] args) {
		abst2 a=new abst1();
		a.m();
	}
}
