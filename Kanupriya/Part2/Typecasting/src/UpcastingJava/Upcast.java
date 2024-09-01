package UpcastingJava;

public class Upcast extends Upcast1 {
	
	Upcast(int a , int b){
		this.a=a;
		this.b=b;
	}

//	public void m(int a, int b) {
//		System.out.println(a*b);
//	}
	public static void main (String [] args) {
		Upcast1 u=new Upcast(5,6); // storing child object inside parent reference type variable 
		u.add();
	}
}
