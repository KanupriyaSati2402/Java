package Exceptions;

public class ChildException extends Arithmetic_Exception{

	public static void main(String [] args) {
		Arithmetic_Exception ap=new Arithmetic_Exception();
		ChildException cp= (ChildException) new Arithmetic_Exception();
	}
}
