package AbstractionJava;

class Abs2 extends Abs{
    
	public void m1() {
   System.out.println("Hello");
   }

	public static void main(String [] args) {
		Abs2 a=new Abs2();
		a.m1();
	}
}
// abstraction by using abstract class 
// we can change the access modifier but it should be changed to a higher access modifeir 