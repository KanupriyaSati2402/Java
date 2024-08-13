package ClassCast;

public class ClassCastJava extends ClassCast2 {
 
	public void print1() {
		System.out.println("Method of child");
	}
	public static void main(String [] args) {
		ClassCastJava i= (ClassCastJava)new ClassCast2(); // we are storing parent into child but the parent doesnot have child 
		i.print();
		
	}
	
}
