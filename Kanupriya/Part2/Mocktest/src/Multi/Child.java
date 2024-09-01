package Multi;

public class Child implements A,B {

	public void m1(){
		System.out.println("hello");
	}
    public void m2() {
		System.out.println("Hi");
	}
	
	public static void main(String [] args) {
	A a=new Child();
	a.m1();
	B b = new Child();
	b.m2();
	}
  
}
