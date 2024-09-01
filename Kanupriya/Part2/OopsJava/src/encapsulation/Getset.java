package encapsulation;

public class Getset {

	private int n ;
	private int a;
	private String name="kanu";
	
//	Getset(int n , int a,String name){
//		this.n=n;
//		this.a=a;
//		this.name=name;
//	}
//	
	public String getname(){
		return name;
	}
	public int Setnum( int a) {
		return this.a=a;
		
	}
	public int setnum(int n) {
		return n;
	}
	
	public static void main(String[] args) {
		Getset g=new Getset();
		System.out.println(g.getname());
		System.out.println(g.Setnum(4));
		System.out.println(g.setnum(7));
//		System.out.println(g.name);

	}
	
}
