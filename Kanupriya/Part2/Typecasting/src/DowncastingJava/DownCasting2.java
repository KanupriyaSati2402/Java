package DowncastingJava;

public class DownCasting2 extends DownCasting {

	public static void main(String [] args) {
		DownCasting d=new DownCasting2(); //upcasting -- parent ke ander child 
		DownCasting2 d1= (DownCasting2) d;
		// downcasting  -- will store parent inside child when the parent have child inside it 
		// parent ke ander child or fr child ke ander parent kuki child h uske ander 
		d1.product();
	}

}
