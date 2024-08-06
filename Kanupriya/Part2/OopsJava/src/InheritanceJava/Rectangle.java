package InheritanceJava;

public class Rectangle extends Measurement {
     
	public void area() {
		System.out.println(l*w);
	}
	public void peri() {
	float a= 2*(l+w);
		System.out.println(a);
	}
	public static void main(String [] args) {
	   Rectangle n = new Rectangle();
	   n.area();
	   n.peri();
	}
}
