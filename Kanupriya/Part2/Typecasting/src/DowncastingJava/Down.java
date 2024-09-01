package DowncastingJava;

public class Down extends Down1{

	Down(int a, int b){
		this.a=a;
		this.b=b;
	}
	public void ma(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String [] args ) {
		Down1 d=new Down(5,7);
		Down d1=(Down) d;
		d1.prod();
		d1.ma(7, 5);
		
	}
}
