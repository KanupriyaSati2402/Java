package MethodOver;

public class Alto extends Car {

	void acceleration() {
		System.out.println("hello method overriding is done");
	}
	public static void main(String [] args) {
		Car c= new Alto();
		c.acceleration();
	}
}
