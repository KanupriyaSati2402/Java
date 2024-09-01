package constructorover;

public class ConstOver {

	ConstOver(){
		System.out.println("hello");
	}
	ConstOver(int a, int b){
		System.out.println(a+b);
	}
	public static void main(String [] args) {
		ConstOver c=new ConstOver();
		ConstOver b=new ConstOver(3,5);
	}
}
