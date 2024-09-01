
public class Encapsulation {

	private int a;
	private String name;
	
	public static void getDetails(int a,String name) {
		System.out.println(a);
		System.out.println(name);
	}
	public void setDetails(String name) {
		this.name=name;
	}
	public static void main(String [] args) {
		Encapsulation e=new Encapsulation();
//		e.getDetails(4,"kanu");
		e.setDetails("");
	}
}
