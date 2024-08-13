package InstanceOf;

public class InstanceOf2 extends Instance {
    
	public static void main(String [] args) {
		Instance u=new InstanceOf2(); //upcasting
	if ( u instanceof Instance ) {
		InstanceOf2 a= (InstanceOf2) new Instance(); //downcasting
		a.print();
	}
	}
}


