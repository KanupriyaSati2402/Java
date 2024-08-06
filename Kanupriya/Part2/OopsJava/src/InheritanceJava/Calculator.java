package InheritanceJava;

public class Calculator extends Numbers {
     
	public void add() {
		System.out.println(a+b);
	}
	public void sub() {
		System.out.println(a-b);
	}
	public void mul() {
		System.out.println(a*b);
	}
	public static void main(String [] args) {
		Calculator c=new Calculator();
		c.add();
		c.sub();
		c.mul();
	}
}
