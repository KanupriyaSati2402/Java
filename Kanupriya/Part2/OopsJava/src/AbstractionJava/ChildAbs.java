package AbstractionJava;

public class ChildAbs implements Abs1{

	public void m2() {
		System.out.println("Heellooooo");
	}
	public static void main(String [] args) {
		ChildAbs b=new ChildAbs();
		b.m2();
	}
}
