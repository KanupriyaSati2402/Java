package UpcastingDown;

class B extends A{

	public static void main(String [] args) {
		A a = new B();
		if(a instanceof A) {
			B b = (B) a;
			b.m1();
		}
	}
}
