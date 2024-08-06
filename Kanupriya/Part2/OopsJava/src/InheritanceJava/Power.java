package InheritanceJava;

public class Power extends Numbers{
   
	public void sqr() {
		System.out.println(a*a);
		System.out.println(b*b);
		
	}
	public void cube() {
		System.out.println(a*a*a);
		System.out.println(b*b*b);
	}
   public static void main(String [] args) {
	   Power p=new Power();
	   p.sqr();
	   p.cube();
   }
}


