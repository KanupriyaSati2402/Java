package Addition_Program;

public class AdditionJava {

	public static void Add(int a , int b) {
		System.out.println(a+b);
	}
	public void Add2(int c,int d,int e) {
		System.out.println(c+d+e);
	}
 // if we will call inside the main method of the same class then will not use the classname
	public static void main(String[] args) {
		Add(3,5);
		
		AdditionJava add= new AdditionJava(); // way to call a non static method 
		add.Add2(4, 6, 7);
	}
	
}

// Static method calling ways  (same for variables)
/*1.Directly By Methodname -- within the class from both static and non static 
 * 2.ClassName.Methodname  -- everywhere from static and non static (mainly outside the class) [within the class when we want 
 * to differeniate between local member and static member that are present outside the method but within the class.
 * 3.Obj Ref.Methodname  -- (everywhere for both static and non static []
 
 * static int r=7; // variable
 * system.out.println(r); -- directly
 * system.out.println(AdditionJava.r);--using classname
 * System.out.println(a.r);-- obj ref.membername
 *
 *
 *-- we can access static method inside static main method
 *-- we can access non static method inside static main method (by creating class object)
 *-- we can access static inside non static method (default cannot be accessed outside the package)
 *
 */
 

