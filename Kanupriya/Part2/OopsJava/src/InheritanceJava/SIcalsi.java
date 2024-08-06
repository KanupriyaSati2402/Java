package InheritanceJava;

public class SIcalsi extends Customer{
   
	public void SI() {
		System.out.println((p*r*t)/100);
	}
	public static void main(String [] args) {
		SIcalsi s=new SIcalsi();
		s.SI();
	}
}
